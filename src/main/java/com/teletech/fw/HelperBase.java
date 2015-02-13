package com.teletech.fw;

import org.hibernate.SessionFactory;

import com.teletech.utils.HibernateUtil;

public class HelperBase {

	protected ApplicationManager myManager;
	public SessionFactory factory = HibernateUtil.getSessionFactory();
	

	public HelperBase(ApplicationManager pMyManager) {

		this.myManager = pMyManager;
	}

}
