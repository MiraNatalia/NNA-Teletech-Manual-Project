package com.teletech.fw;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.teletech.data.CustEmail;

public class HibernateEmailHelper extends HelperBase {

	public HibernateEmailHelper(ApplicationManager manager) {
		super(manager);
	}

	public List<CustEmail> listCustEmails() {

		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		try {
			return (List<CustEmail>) session.createQuery("from Cust_Email")
					.list();
		} finally {
			trans.commit();
			session.close();
		}
	}

	/* Method to UPDATE brand_suppression for an cust_email */
	public void updateEmail(String tmsw_cust_id, int brand_suppression) {
		Session session = factory.openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();

			CustEmail email = (CustEmail) session.get(CustEmail.class, tmsw_cust_id);

			email.setBrand_suppression(brand_suppression);

			session.update(email);

			trans.commit();
		} catch (HibernateException e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to CREATE a customer email in the database */
	public Integer addEmail(String email_addr

	/*
	 * int email_id, int tmsw_cust_id, char email_type_cd, String
	 * data_source_cd, String email_addr, int do_not_email, Date date_updated,
	 * int invalid_email, verified no_of_attempt email_status_cd
	 * email_addr_last_updated do_not_email_last_updated vendor_data_source_cd
	 * brand_suppression
	 */

	/*
	 * insert into cust_email ( [tmsw_cust_id] ,[email_type_cd]
	 * ,[data_source_cd] ,[email_addr] ,[do_not_email] ,[date_updated]
	 * ,[invalid_email] ,[verified] ,[no_of_attempt] ,[email_status_cd]
	 * ,[email_addr_last_updated] ,[do_not_email_last_updated]
	 * ,[vendor_data_source_cd] ,[brand_suppression]) values (
	 * 
	 * @v_customer, 'W', 'CCC', 'workGS2@gmail.com', '0', '2003-10-24
	 * 13:24:34.120', '0', '1', '3', '01', '2003-10-24 13:43:48.597',
	 * '2003-10-24 13:43:48.597', null, null)
	 */

	) {
		Session session = factory.openSession();
		Transaction trans = null;
		Integer emailID = null;
		try {
			trans = session.beginTransaction();
			
			CustEmail email = new CustEmail();
			email.setEmail_addr(email_addr);
			
			emailID = (Integer) session.save(email);
			trans.commit();
		} catch (HibernateException e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emailID;
	}

	/*
	 * public List<CustomerData> listCustomers() { Session session =
	 * HibernateUtil.getSessionFactory().getCurrentSession(); Transaction trans
	 * = session.beginTransaction(); try { return (List<CustomerData>)
	 * session.createQuery("select top 100 * from CustomerData").list(); }
	 * finally { trans.commit(); } }
	 */
}
