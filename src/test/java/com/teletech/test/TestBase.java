package com.teletech.test;

import java.util.ArrayList;
import java.util.List;

import com.teletech.data.TestCase;
import com.teletech.fw.ApplicationManager;

public class TestBase {

	public TestBase() {

		app = new ApplicationManager();

	}

	// TestBase hires Application Manager; protected as all TestBase descendants
	// should be able to use it
	protected static ApplicationManager app;
	
	
//	// Iterator is used to iterate over a collection
//	@DataProvider
//	public Iterator<Object[]> randomValidGroupGenerator() {
//		return wrapTestCasesForDataProvider(generateRandomGroups(5)).iterator();
//	}

	public static List<Object[]> wrapTestCasesForDataProvider(List<TestCase> testCases) {
		List<Object[]> list = new ArrayList<Object[]>();
		for (TestCase testCase : testCases) {
			list.add(new Object[] { testCase });
		}
		return list;
	}

}
