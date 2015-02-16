package com.teletech.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.teletech.data.TestCase;

public class TestDataGenerator extends TestDataGeneratorBase {

	public static List<TestCase> loadTestCasesFromCsvFile(File file)
			throws IOException {
		List<TestCase> list = new ArrayList<TestCase>();
		FileReader reader = new FileReader(file);
		BufferedReader buffReader = new BufferedReader(reader);
		String line = buffReader.readLine();
		while (line != null) {
			String[] split = line.split(",");
			TestCase testCase = new TestCase()
					.setJiraTicket(split[0])
					.setMake(split[1])
					.setActivityType(split[2])
					.setPrefCommMethodId(split[3])
					.setHomeDoNotPhone(split[4])
					.setHomePhoneBrandSuppression(split[5])
					.setWorkDoNotPhone(split[6])
					.setWorkPhoneBrandSuppression(split[7])
					.setCellDoNotPhone(split[8])
					.setCellPhoneBrandSuppression(split[9])
					.setHomeDoNotEmail(split[10])
					.setHomeEmailBrandSuppression(split[11])
					.setWorkDoNotEmail(split[12])
					.setWorkEmailBrandSuppression(split[13])
					.setHomeDoNotMail(split[14])
					.setHomeMailBrandSuppression(split[15])
					.setWorkDoNotMail(split[16])
					.setWorkMailBrandSuppression(split[17]);
			
			line = buffReader.readLine();
			list.add(testCase);
		}

		buffReader.close();
		return list;
	}

}
