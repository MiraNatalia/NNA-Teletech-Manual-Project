package com.teletech.data;

//tmsw_cust table
public class CustomerData {

	private int tmsw_cust_id;
	private String first_name;
	private String mid_name;
	private String last_name;

	public CustomerData(int tmsw_cust_id, String first_name, String mid_name, String last_name) {
		// super();
		this.tmsw_cust_id = tmsw_cust_id;
		this.first_name = first_name;
		this.mid_name = mid_name;
		this.last_name = last_name;
	}

	public CustomerData() {

	}

	@Override
	public String toString() {
		return "CustomerData [tmsw_cust_id=" + tmsw_cust_id + ", first_name="
				+ first_name + ", mid_name=" + mid_name + ", last_name="
				+ last_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result
				+ ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result
				+ ((mid_name == null) ? 0 : mid_name.hashCode());
		result = prime * result + tmsw_cust_id;
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
		CustomerData other = (CustomerData) obj;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (mid_name == null) {
			if (other.mid_name != null)
				return false;
		} else if (!mid_name.equals(other.mid_name))
			return false;
		if (tmsw_cust_id != other.tmsw_cust_id)
			return false;
		return true;
	}

	public int getTmsw_cust_id() {
		return tmsw_cust_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getMid_name() {
		return mid_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setTmsw_cust_id(int tmsw_cust_id) {
		this.tmsw_cust_id = tmsw_cust_id;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setMid_name(String mid_name) {
		this.mid_name = mid_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	

}
