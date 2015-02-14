package com.teletech.data;

import java.sql.Date;

public class CustEmail {

	private int email_id;
	private int tmsw_cust_id;
	private char email_type_cd;
	private String data_source_cd;
	private String vendor_data_source_cd;
	private String email_addr;
	private int do_not_email;
	private int brand_suppression;
	private int invalid_email;
	private int verified;
	private int no_of_attempt;
	private char email_status_cd;
	private Date do_not_email_last_updated;
	private Date date_updated;
	private Date email_addr_last_updated;
	private String rowguid;

	public CustEmail() {
		super();

	}



	public CustEmail(int email_id, int tmsw_cust_id, char email_type_cd,
			String data_source_cd, String vendor_data_source_cd,
			String email_addr, int do_not_email, int brand_suppression,
			int invalid_email, int verified, int no_of_attampt,
			char email_status_cd, Date do_not_email_last_updated,
			Date date_updated, Date email_addr_last_updated, String rowguid) {
		super();
		this.email_id = email_id;
		this.tmsw_cust_id = tmsw_cust_id;
		this.email_type_cd = email_type_cd;
		this.data_source_cd = data_source_cd;
		this.vendor_data_source_cd = vendor_data_source_cd;
		this.email_addr = email_addr;
		this.do_not_email = do_not_email;
		this.brand_suppression = brand_suppression;
		this.invalid_email = invalid_email;
		this.verified = verified;
		this.no_of_attempt = no_of_attampt;
		this.email_status_cd = email_status_cd;
		this.do_not_email_last_updated = do_not_email_last_updated;
		this.date_updated = date_updated;
		this.email_addr_last_updated = email_addr_last_updated;
		this.rowguid = rowguid;
	}



	public String getData_source_cd() {
		return data_source_cd;
	}

	public String getVendor_data_source_cd() {
		return vendor_data_source_cd;
	}

	public int getVerified() {
		return verified;
	}

	public int getNo_of_attempt() {
		return no_of_attempt;
	}

	public char getEmail_status_cd() {
		return email_status_cd;
	}

	public Date getEmail_addr_last_updated() {
		return email_addr_last_updated;
	}

	public String getRowguid() {
		return rowguid;
	}

	public void setData_source_cd(String data_source_cd) {
		this.data_source_cd = data_source_cd;
	}

	public void setVendor_data_source_cd(String vendor_data_source_cd) {
		this.vendor_data_source_cd = vendor_data_source_cd;
	}

	public void setVerified(int verified) {
		this.verified = verified;
	}

	public void setNo_of_attempt(int no_of_attampt) {
		this.no_of_attempt = no_of_attampt;
	}

	public void setEmail_status_cd(char email_status_cd) {
		this.email_status_cd = email_status_cd;
	}

	public void setEmail_addr_last_updated(Date email_addr_last_updated) {
		this.email_addr_last_updated = email_addr_last_updated;
	}

	public void setRowguid(String rowguid) {
		this.rowguid = rowguid;
	}

	public int getEmail_id() {
		return email_id;
	}

	public int getTmsw_cust_id() {
		return tmsw_cust_id;
	}

	public char getEmail_type_cd() {
		return email_type_cd;
	}

	public String getEmail_addr() {
		return email_addr;
	}

	public int getDo_not_email() {
		return do_not_email;
	}

	public int getBrand_suppression() {
		return brand_suppression;
	}

	public int getInvalid_email() {
		return invalid_email;
	}

	public char getEmail_status() {
		return email_status_cd;
	}

	public Date getDo_not_email_last_updated() {
		return do_not_email_last_updated;
	}

	public Date getDate_updated() {
		return date_updated;
	}

	public void setEmail_id(int email_id) {
		this.email_id = email_id;
	}

	public void setTmsw_cust_id(int tmsw_cust_id) {
		this.tmsw_cust_id = tmsw_cust_id;
	}

	public void setEmail_type_cd(char email_type_cd) {
		this.email_type_cd = email_type_cd;
	}

	public void setEmail_addr(String email_addr) {
		this.email_addr = email_addr;
	}

	public void setDo_not_email(int do_not_email) {
		this.do_not_email = do_not_email;
	}

	public void setBrand_suppression(int brand_suppression) {
		this.brand_suppression = brand_suppression;
	}

	public void setInvalid_email(int invalid_email) {
		this.invalid_email = invalid_email;
	}

	public void setEmail_status(char email_status) {
		this.email_status_cd = email_status;
	}

	public void setDo_not_email_last_updated(Date do_not_email_last_updated) {
		this.do_not_email_last_updated = do_not_email_last_updated;
	}

	public void setDate_updated(Date date_updated) {
		this.date_updated = date_updated;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + brand_suppression;
		result = prime * result
				+ ((data_source_cd == null) ? 0 : data_source_cd.hashCode());
		result = prime * result
				+ ((date_updated == null) ? 0 : date_updated.hashCode());
		result = prime * result + do_not_email;
		result = prime
				* result
				+ ((do_not_email_last_updated == null) ? 0
						: do_not_email_last_updated.hashCode());
		result = prime * result
				+ ((email_addr == null) ? 0 : email_addr.hashCode());
		result = prime
				* result
				+ ((email_addr_last_updated == null) ? 0
						: email_addr_last_updated.hashCode());
		result = prime * result + email_id;
		result = prime * result + email_status_cd;
		result = prime * result + email_type_cd;
		result = prime * result + invalid_email;
		result = prime * result + no_of_attempt;
		result = prime * result + ((rowguid == null) ? 0 : rowguid.hashCode());
		result = prime * result + tmsw_cust_id;
		result = prime
				* result
				+ ((vendor_data_source_cd == null) ? 0 : vendor_data_source_cd
						.hashCode());
		result = prime * result + verified;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustEmail other = (CustEmail) obj;
		if (brand_suppression != other.brand_suppression)
			return false;
		if (data_source_cd == null) {
			if (other.data_source_cd != null)
				return false;
		} else if (!data_source_cd.equals(other.data_source_cd))
			return false;
		if (date_updated == null) {
			if (other.date_updated != null)
				return false;
		} else if (!date_updated.equals(other.date_updated))
			return false;
		if (do_not_email != other.do_not_email)
			return false;
		if (do_not_email_last_updated == null) {
			if (other.do_not_email_last_updated != null)
				return false;
		} else if (!do_not_email_last_updated
				.equals(other.do_not_email_last_updated))
			return false;
		if (email_addr == null) {
			if (other.email_addr != null)
				return false;
		} else if (!email_addr.equals(other.email_addr))
			return false;
		if (email_addr_last_updated == null) {
			if (other.email_addr_last_updated != null)
				return false;
		} else if (!email_addr_last_updated
				.equals(other.email_addr_last_updated))
			return false;
		if (email_id != other.email_id)
			return false;
		if (email_status_cd != other.email_status_cd)
			return false;
		if (email_type_cd != other.email_type_cd)
			return false;
		if (invalid_email != other.invalid_email)
			return false;
		if (no_of_attempt != other.no_of_attempt)
			return false;
		if (rowguid == null) {
			if (other.rowguid != null)
				return false;
		} else if (!rowguid.equals(other.rowguid))
			return false;
		if (tmsw_cust_id != other.tmsw_cust_id)
			return false;
		if (vendor_data_source_cd == null) {
			if (other.vendor_data_source_cd != null)
				return false;
		} else if (!vendor_data_source_cd.equals(other.vendor_data_source_cd))
			return false;
		if (verified != other.verified)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustEmail [email_id=" + email_id + ", tmsw_cust_id="
				+ tmsw_cust_id + ", email_type_cd=" + email_type_cd
				+ ", data_source_cd=" + data_source_cd
				+ ", vendor_data_source_cd=" + vendor_data_source_cd
				+ ", email_addr=" + email_addr + ", do_not_email="
				+ do_not_email + ", brand_suppression=" + brand_suppression
				+ ", invalid_email=" + invalid_email + ", verified=" + verified
				+ ", no_of_attampt=" + no_of_attempt + ", email_status_cd="
				+ email_status_cd + ", do_not_email_last_updated="
				+ do_not_email_last_updated + ", date_updated=" + date_updated
				+ ", email_addr_last_updated=" + email_addr_last_updated
				+ ", rowguid=" + rowguid + "]";
	}

	
	
	
}
