CREATE table  tmp_test 
(
test_case_no varchar(20),
tmsw_cust_id INT, 
dealer_customer_no_id INT, 
cust_activity_dtl_id INT, 
make_id CHAR(2)
)



ALTER PROCEDURE [dbo].[nna_test_case_template] 

 @p_jira_tichet varchar(20),
	
 @p_make CHAR(2),    
 
 @p_activity_type varchar(20), 
 
 @pref_comm_method_id INT,
 
 @h_do_not_phone INT =NULL,
 @h_phome_brand_suppression INT =NULL,
 
 @w_do_not_phone INT =NULL,
 @w_phome_brand_suppression INT =NULL,
 
 @cell_do_not_phone INT =NULL,
 @cell_phome_brand_suppression INT =NULL,
 
 @w_do_not_email  INT =NULL, 
 @w_email_brand_suppression INT =NULL,
 
 @h_do_not_email  INT =NULL, 
 @h_email_brand_suppression INT =NULL,
 
 @h_do_not_mail INT =NULL,
 @h_mail_brand_suppression INT =NULL,
 
 @w_do_not_mail INT =NULL,
 @w_mail_brand_suppression INT =NULL
  
AS
BEGIN

declare @v_make       varchar(2) 
select @v_make=@p_make
declare @v_customer       INT 
declare @v_activity_type       varchar(20) 
select @v_activity_type=@p_activity_type
declare @v_dealer_customer_no_id       varchar(50) 
declare @v_cust_activity_dtl_id       varchar(50)
declare @v_cust_activity_id      varchar(50)




--DECLARE TABLE NAME VARIABLE DYNAMICALLY
DECLARE @table_name varchar(max)
SET @table_name = 
    (SELECT 'TEST_Customers_for_Call_LISTs_'
            + convert(varchar,getdate(),112))


--DROP THE TABLE IF IT ALREADY EXISTS
IF EXISTS(SELECT name 
          FROM sysobjects 
          WHERE name = @table_name)

BEGIN
    EXEC('drop table ' +  @table_name)
END



-- table for cases ONES created
--create table forTest_table_of_customers_for_Call_Lists_NSC (test_case_no CHAR(2) IDENTITY(1,1), tmsw_cust_id CHAR(2),dealer_customer_no_id       varchar(50), cust_activity_dtl_id       varchar(50)  )

select top 1 @v_customer=pur.tmsw_cust_id, 
@v_dealer_customer_no_id=d.dealer_customer_no_id, 
@v_cust_activity_dtl_id=d.cust_activity_dtl_id  
from cust_activities_detail as d 
inner join dealer_customer_no as n 
on d.dealer_customer_no_id=n.dealer_customer_no_id
inner join purchaser as pur 
on n.purchaser_id=pur.purchaser_id
where pur.make_id=@v_make 
and exists (select 'x' from cust_phone as e where e.tmsw_cust_id=pur.tmsw_cust_id  and e.phone_type_cd='01' and invalid_phone='0' and phone_status_cd='01') 
and activity_type_cd=@v_activity_type


---no auto osc------------
if  exists (select 'y' from nna_auto_osc_cust au where au.dealer_customer_no_id=@v_dealer_customer_no_id)
begin

delete from nna_auto_osc_cust where dealer_customer_no_id=@v_dealer_customer_no_id 

end



if not exists (select '1' from cust_phone where tmsw_cust_id=@v_customer and phone_type_cd='02')

begin

INSERT into cust_phone (phone_type_cd,tmsw_cust_id,area_cd, phone_num, ext, day_night_phone, do_not_phone,data_source_cd, date_updated, invalid_phone, phone_status_cd, wireless_phone)
VALUES ('02',@v_customer, '713', '6410307', 'NULL', 'N', '0', 'CCC','2014-11-21', '0', '01','0');

end	  


insert INTO tmp_test  (test_case_no,tmsw_cust_id, dealer_customer_no_id, cust_activity_dtl_id, make_id)
values (@p_jira_tichet,@v_customer,@v_dealer_customer_no_id, @v_cust_activity_dtl_id,  @v_make )

EXEC('SELECT * INTO ' + @table_name + ' FROM dbo.tmp_test')

--delete from cust_address where tmsw_cust_id=@v_customer and addr_type_cd in ('02','03','04','05')

---cust_CHAR(2)erval - We need this entry!!!
select @v_cust_activity_id=(select cust_activity_id  from dbo.cust_activities_detail
where dealer_customer_no_id=@v_dealer_customer_no_id and activity_type_cd=@v_activity_type)


if not exists (select '1'  from cust_interval where dealer_customer_no_id=@v_dealer_customer_no_id and cust_activity_id=@v_cust_activity_id)

begin


insert into cust_interval(dealer_customer_no_id,cust_activity_id,interval_no,interval_type,prsnl_mntns_guide_min_max_id,date_updated)
values (@v_dealer_customer_no_id,@v_cust_activity_id,23,'Mileage',2,'2014-01-02 10:16:55.733')

end

----------------Preferred communication method------------------------
delete from cust_pref_communication_method where tmsw_cust_id=@v_customer

insert into cust_pref_communication_method
(
tmsw_cust_id,
pref_comm_method_id,
pref_calling_time_cd,
date_updated
)
values (
@v_customer,
@pref_comm_method_id,
'E',
'2014-01-02 00:00:00.000')

----- PNONE OPTIONS----------------
update cust_phone
set do_not_phone=@h_do_not_phone   
where tmsw_cust_id=@v_customer and phone_type_cd='01'

update cust_phone
set brand_suppression=@h_phome_brand_suppression   
where tmsw_cust_id=@v_customer and phone_type_cd='01'


update cust_phone
set do_not_phone=@w_do_not_phone   
where tmsw_cust_id=@v_customer and phone_type_cd='02'

update cust_phone
set brand_suppression=@w_phome_brand_suppression   
where tmsw_cust_id=@v_customer and phone_type_cd='02'

----- EMAIL OPTIONS----------------
 
update cust_email
set do_not_email=@h_do_not_email   
where tmsw_cust_id=@v_customer and email_type_cd='H'

update cust_email
set brand_suppression=@h_email_brand_suppression   
where tmsw_cust_id=@v_customer and email_type_cd='H'

if not exists (select '1' from cust_email where tmsw_cust_id=@v_customer and email_type_cd='W')

begin

  insert into cust_email (
		[tmsw_cust_id]
      ,[email_type_cd]
      ,[data_source_cd]
      ,[email_addr]
      ,[do_not_email]
      ,[date_updated]
      ,[invalid_email]
       ,[verified]
      ,[no_of_attempt]
      ,[email_status_cd]
      ,[email_addr_last_updated]
      ,[do_not_email_last_updated]
      ,[vendor_data_source_cd]
      ,[brand_suppression])
	  values
	  (
	 @v_customer,
	  'W',
	  'CCC',
	  'workGS2@gmail.com',
	  '0',
	   '2003-10-24 13:24:34.120',
	   '0',
	   '1',
	  '3',
	  '01',
	  '2003-10-24 13:43:48.597',
	  '2003-10-24 13:43:48.597',
	  null,
	  null)
	  
end	


update cust_email
set do_not_email=@w_do_not_email   
where tmsw_cust_id=@v_customer and email_type_cd='W'

update cust_email
set brand_suppression=@w_email_brand_suppression  
where tmsw_cust_id=@v_customer and email_type_cd='W'

----Make sure NED is correct--------
update dbo.cust_activities
set service_expected_date='2014-04-04 00:00:00.000'
where dealer_customer_no_id=@v_dealer_customer_no_id

END





