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

	 @DataProvider
	 public Iterator<Object[]> testCasesFromFile() throws IOException {
	 return wrapTestCasesForDataProvider(loadTestCasesFromCsvFile(new
	 File("teletechTestCases.csv"))).iterator();
	 }
	

	// java core library java.sql package
	Connection conn = null;
	CallableStatement stmt = null;

	public TeletechTest() {
		super();

	}

	@Test
	// @Test(dataProvider = "groupsFromFile")
	public void teletechBasicTestDataCreation(TestCase testCase) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = session.beginTransaction();

		try {

			conn = HibernateUtil.getConnection();

			String sql = "{call nna_test_case_template ('61', '1', 'NSC', 1, 1, 1, 1, 2,''  ,'', 1, 3, 0, null, 1, 2)}";

			// callablestatement object initiation
			stmt = conn.prepareCall(sql);

			// // Bind IN parameter first, then bind OUT parameter
			// int empID = 102;
			// stmt.setString(1, "Test");
			// stmt.setInt(1, empID); // This would set ID as 102
			// // Because second parameter is OUT so register it
			// stmt.registerOutParameter(2, java.sql.Types.VARCHAR);

			// Use execute method to run stored procedure.
			System.out.println("Executing stored procedure...");
			stmt.execute();

			// // Retrieve employee name with getXXX method
			// String empName = stmt.getString(2);
			// System.out.println("Emp Name with ID:" + empID + " is " +
			// empName);
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
