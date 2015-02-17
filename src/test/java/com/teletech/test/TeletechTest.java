package com.teletech.test;

import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.teletech.data.TestCase;
import com.teletech.utils.HibernateUtil;
import static com.teletech.utils.TestDataGenerator.loadTestCasesFromCsvFile;

public class TeletechTest extends TestBase {

	// java core library java.sql package
	Connection conn = null;
	CallableStatement stmt = null;

	public TeletechTest() {
		super();
	}
	
	@DataProvider
	public Iterator<Object[]> testCasesFromFile() throws IOException {
		return wrapTestCasesForDataProvider(
				loadTestCasesFromCsvFile(new File("teletechTestCases.csv")))
				.iterator();
	}

	@Test(dataProvider = "testCasesFromFile")
	public void teletechBasicTestDataCreation(TestCase testCase) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = session.beginTransaction();

		try {

			conn = HibernateUtil.getConnection();

			String sql = "{call nna_test_case_template (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}"; // 18 params

			// callablestatement object initiation
			stmt = conn.prepareCall(sql);
			
			// set parameters for statement from test case
			// Bind IN parameter first, then bind OUT parameter
			stmt.setString(1, testCase.getJiraTicket());
			stmt.setString(2, testCase.getMake());
			stmt.setString(3, testCase.getActivityType());
			stmt.setString(4, testCase.getPrefCommMethodId());
			stmt.setString(5, testCase.getHomeDoNotPhone());
			stmt.setString(6, testCase.getHomePhoneBrandSuppression());
			stmt.setString(7, testCase.getWorkDoNotPhone());
			stmt.setString(8, testCase.getWorkPhoneBrandSuppression());
			stmt.setString(9, testCase.getCellDoNotPhone());
			stmt.setString(10, testCase.getCellPhoneBrandSuppression());
			
			stmt.setString(11, testCase.getWorkDoNotEmail());
			stmt.setString(12, testCase.getWorkEmailBrandSuppression());
			stmt.setString(13, testCase.getHomeDoNotEmail());
			stmt.setString(14, testCase.getHomeEmailBrandSuppression());
			
			stmt.setString(15, testCase.getHomeDoNotMail());
			stmt.setString(16, testCase.getHomeMailBrandSuppression());
			stmt.setString(17, testCase.getWorkDoNotMail());
			stmt.setString(18, testCase.getWorkMailBrandSuppression());
			

			// Bind OUT 
			// stmt.registerOutParameter(2, java.sql.Types.VARCHAR);

			// Use execute method to run stored procedure.
			System.out.println("Executing stored procedure...");
			stmt.execute();

			// Retrieve employee name with getXXX method
			// String empName = stmt.getString(2);
			// System.out.println("Emp Name with ID:" + empID + " is " + empName);
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			trans.commit();
			session.close();
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");

	}
}
