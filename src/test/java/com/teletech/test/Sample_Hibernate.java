package com.teletech.test;

import org.testng.annotations.Test;

public class Sample_Hibernate extends TestBase {

	@Test
	public void SampleTest()  {
	System.out.println(app.getHibernateHelper().listCustEmails());
	}

}
