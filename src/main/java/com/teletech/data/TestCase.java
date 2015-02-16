package com.teletech.data;

public class TestCase implements Comparable<TestCase> {

	private String jiraTicket;
	private String make;
	private String activityType;
	private String prefCommMethodId;
	private String homeDoNotPhone;
	private String homePhoneBrandSuppression;
	private String workDoNotPhone;
	private String workPhoneBrandSuppression;
	private String cellDoNotPhone;
	private String cellPhoneBrandSuppression;
	private String homeDoNotEmail;
	private String homeEmailBrandSuppression;
	private String workDoNotEmail;
	private String workEmailBrandSuppression;
	private String homeDoNotMail;
	private String homeMailBrandSuppression;
	private String workDoNotMail;
	private String workMailBrandSuppression;

	public TestCase() {

	}

	public TestCase setJiraTicket(String jiraTicket) {
		this.jiraTicket = jiraTicket;
		return this;
	}

	public TestCase setMake(String make) {
		this.make = make;
		return this;
	}

	public TestCase setActivityType(String activityType) {
		this.activityType = activityType;
		return this;
	}

	public TestCase setPrefCommMethodId(String prefCommMethodId) {
		this.prefCommMethodId = prefCommMethodId;
		return this;
	}

	public TestCase setHomeDoNotPhone(String homeDoNotPhone) {
		this.homeDoNotPhone = homeDoNotPhone;
		return this;
	}

	public TestCase setHomePhoneBrandSuppression(
			String homePhoneBrandSuppression) {
		this.homePhoneBrandSuppression = homePhoneBrandSuppression;
		return this;
	}

	public TestCase setWorkDoNotPhone(String workDoNotPhone) {
		this.workDoNotPhone = workDoNotPhone;
		return this;
	}

	public TestCase setWorkPhoneBrandSuppression(
			String workPhoneBrandSuppression) {
		this.workPhoneBrandSuppression = workPhoneBrandSuppression;
		return this;
	}

	public TestCase setCellDoNotPhone(String cellDoNotPhone) {
		this.cellDoNotPhone = cellDoNotPhone;
		return this;
	}

	public TestCase setCellPhoneBrandSuppression(
			String cellPhoneBrandSuppression) {
		this.cellPhoneBrandSuppression = cellPhoneBrandSuppression;
		return this;
	}

	public TestCase setHomeDoNotEmail(String homeDoNotEmail) {
		this.homeDoNotEmail = homeDoNotEmail;
		return this;
	}

	public TestCase setHomeEmailBrandSuppression(
			String homeEmailBrandSuppression) {
		this.homeEmailBrandSuppression = homeEmailBrandSuppression;
		return this;
	}

	public TestCase setWorkDoNotEmail(String workDoNotEmail) {
		this.workDoNotEmail = workDoNotEmail;
		return this;
	}

	public TestCase setWorkEmailBrandSuppression(
			String workEmailBrandSuppression) {
		this.workEmailBrandSuppression = workEmailBrandSuppression;
		return this;
	}

	public TestCase setHomeDoNotMail(String homeDoNotMail) {
		this.homeDoNotMail = homeDoNotMail;
		return this;
	}

	public TestCase setHomeMailBrandSuppression(String homeMailBrandSuppression) {
		this.homeMailBrandSuppression = homeMailBrandSuppression;
		return this;
	}

	public TestCase setWorkDoNotMail(String workDoNotMail) {
		this.workDoNotMail = workDoNotMail;
		return this;
	}

	public TestCase setWorkMailBrandSuppression(String workMailBrandSuppression) {
		this.workMailBrandSuppression = workMailBrandSuppression;
		return this;
	}

	public String getJiraTicket() {
		return jiraTicket;
	}

	public String getMake() {
		return make;
	}

	public String getActivityType() {
		return activityType;
	}

	public String getPrefCommMethodId() {
		return prefCommMethodId;
	}

	public String getHomeDoNotPhone() {
		return homeDoNotPhone;
	}

	public String getHomePhoneBrandSuppression() {
		return homePhoneBrandSuppression;
	}

	public String getWorkDoNotPhone() {
		return workDoNotPhone;
	}

	public String getWorkPhoneBrandSuppression() {
		return workPhoneBrandSuppression;
	}

	public String getCellDoNotPhone() {
		return cellDoNotPhone;
	}

	public String getCellPhoneBrandSuppression() {
		return cellPhoneBrandSuppression;
	}

	public String getHomeDoNotEmail() {
		return homeDoNotEmail;
	}

	public String getHomeEmailBrandSuppression() {
		return homeEmailBrandSuppression;
	}

	public String getWorkDoNotEmail() {
		return workDoNotEmail;
	}

	public String getWorkEmailBrandSuppression() {
		return workEmailBrandSuppression;
	}

	public String getHomeDoNotMail() {
		return homeDoNotMail;
	}

	public String getHomeMailBrandSuppression() {
		return homeMailBrandSuppression;
	}

	public String getWorkDoNotMail() {
		return workDoNotMail;
	}

	public String getWorkMailBrandSuppression() {
		return workMailBrandSuppression;
	}

	@Override
	public int compareTo(TestCase arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "TestCase [jiraTicket=" + jiraTicket + ", make=" + make
				+ ", activityType=" + activityType + ", prefCommMethodId="
				+ prefCommMethodId + ", homeDoNotPhone=" + homeDoNotPhone
				+ ", homePhoneBrandSuppression=" + homePhoneBrandSuppression
				+ ", workDoNotPhone=" + workDoNotPhone
				+ ", workPhoneBrandSuppression=" + workPhoneBrandSuppression
				+ ", cellDoNotPhone=" + cellDoNotPhone
				+ ", cellPhoneBrandSuppression=" + cellPhoneBrandSuppression
				+ ", homeDoNotEmail=" + homeDoNotEmail
				+ ", homeEmailBrandSuppression=" + homeEmailBrandSuppression
				+ ", workDoNotEmail=" + workDoNotEmail
				+ ", workEmailBrandSuppression=" + workEmailBrandSuppression
				+ ", homeDoNotMail=" + homeDoNotMail
				+ ", homeMailBrandSuppression=" + homeMailBrandSuppression
				+ ", workDoNotMail=" + workDoNotMail
				+ ", workMailBrandSuppression=" + workMailBrandSuppression
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((activityType == null) ? 0 : activityType.hashCode());
		result = prime * result
				+ ((cellDoNotPhone == null) ? 0 : cellDoNotPhone.hashCode());
		result = prime
				* result
				+ ((cellPhoneBrandSuppression == null) ? 0
						: cellPhoneBrandSuppression.hashCode());
		result = prime * result
				+ ((homeDoNotEmail == null) ? 0 : homeDoNotEmail.hashCode());
		result = prime * result
				+ ((homeDoNotMail == null) ? 0 : homeDoNotMail.hashCode());
		result = prime * result
				+ ((homeDoNotPhone == null) ? 0 : homeDoNotPhone.hashCode());
		result = prime
				* result
				+ ((homeEmailBrandSuppression == null) ? 0
						: homeEmailBrandSuppression.hashCode());
		result = prime
				* result
				+ ((homeMailBrandSuppression == null) ? 0
						: homeMailBrandSuppression.hashCode());
		result = prime
				* result
				+ ((homePhoneBrandSuppression == null) ? 0
						: homePhoneBrandSuppression.hashCode());
		result = prime * result
				+ ((jiraTicket == null) ? 0 : jiraTicket.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime
				* result
				+ ((prefCommMethodId == null) ? 0 : prefCommMethodId.hashCode());
		result = prime * result
				+ ((workDoNotEmail == null) ? 0 : workDoNotEmail.hashCode());
		result = prime * result
				+ ((workDoNotMail == null) ? 0 : workDoNotMail.hashCode());
		result = prime * result
				+ ((workDoNotPhone == null) ? 0 : workDoNotPhone.hashCode());
		result = prime
				* result
				+ ((workEmailBrandSuppression == null) ? 0
						: workEmailBrandSuppression.hashCode());
		result = prime
				* result
				+ ((workMailBrandSuppression == null) ? 0
						: workMailBrandSuppression.hashCode());
		result = prime
				* result
				+ ((workPhoneBrandSuppression == null) ? 0
						: workPhoneBrandSuppression.hashCode());
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
		TestCase other = (TestCase) obj;
		if (activityType == null) {
			if (other.activityType != null)
				return false;
		} else if (!activityType.equals(other.activityType))
			return false;
		if (cellDoNotPhone == null) {
			if (other.cellDoNotPhone != null)
				return false;
		} else if (!cellDoNotPhone.equals(other.cellDoNotPhone))
			return false;
		if (cellPhoneBrandSuppression == null) {
			if (other.cellPhoneBrandSuppression != null)
				return false;
		} else if (!cellPhoneBrandSuppression
				.equals(other.cellPhoneBrandSuppression))
			return false;
		if (homeDoNotEmail == null) {
			if (other.homeDoNotEmail != null)
				return false;
		} else if (!homeDoNotEmail.equals(other.homeDoNotEmail))
			return false;
		if (homeDoNotMail == null) {
			if (other.homeDoNotMail != null)
				return false;
		} else if (!homeDoNotMail.equals(other.homeDoNotMail))
			return false;
		if (homeDoNotPhone == null) {
			if (other.homeDoNotPhone != null)
				return false;
		} else if (!homeDoNotPhone.equals(other.homeDoNotPhone))
			return false;
		if (homeEmailBrandSuppression == null) {
			if (other.homeEmailBrandSuppression != null)
				return false;
		} else if (!homeEmailBrandSuppression
				.equals(other.homeEmailBrandSuppression))
			return false;
		if (homeMailBrandSuppression == null) {
			if (other.homeMailBrandSuppression != null)
				return false;
		} else if (!homeMailBrandSuppression
				.equals(other.homeMailBrandSuppression))
			return false;
		if (homePhoneBrandSuppression == null) {
			if (other.homePhoneBrandSuppression != null)
				return false;
		} else if (!homePhoneBrandSuppression
				.equals(other.homePhoneBrandSuppression))
			return false;
		if (jiraTicket == null) {
			if (other.jiraTicket != null)
				return false;
		} else if (!jiraTicket.equals(other.jiraTicket))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (prefCommMethodId == null) {
			if (other.prefCommMethodId != null)
				return false;
		} else if (!prefCommMethodId.equals(other.prefCommMethodId))
			return false;
		if (workDoNotEmail == null) {
			if (other.workDoNotEmail != null)
				return false;
		} else if (!workDoNotEmail.equals(other.workDoNotEmail))
			return false;
		if (workDoNotMail == null) {
			if (other.workDoNotMail != null)
				return false;
		} else if (!workDoNotMail.equals(other.workDoNotMail))
			return false;
		if (workDoNotPhone == null) {
			if (other.workDoNotPhone != null)
				return false;
		} else if (!workDoNotPhone.equals(other.workDoNotPhone))
			return false;
		if (workEmailBrandSuppression == null) {
			if (other.workEmailBrandSuppression != null)
				return false;
		} else if (!workEmailBrandSuppression
				.equals(other.workEmailBrandSuppression))
			return false;
		if (workMailBrandSuppression == null) {
			if (other.workMailBrandSuppression != null)
				return false;
		} else if (!workMailBrandSuppression
				.equals(other.workMailBrandSuppression))
			return false;
		if (workPhoneBrandSuppression == null) {
			if (other.workPhoneBrandSuppression != null)
				return false;
		} else if (!workPhoneBrandSuppression
				.equals(other.workPhoneBrandSuppression))
			return false;
		return true;
	}
	
	

}
