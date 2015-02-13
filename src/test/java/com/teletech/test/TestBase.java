package com.teletech.test;

import com.teletech.fw.ApplicationManager;

public class TestBase {

	public TestBase() {

		app = new ApplicationManager();

	}

	// TestBase hires Application Manager; protected as all TestBase descendants
	// should be able to use it
	protected static ApplicationManager app;

}
