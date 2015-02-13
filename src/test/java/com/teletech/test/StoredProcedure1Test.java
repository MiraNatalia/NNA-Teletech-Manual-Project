package com.teletech.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class StoredProcedure1Test  {
	
//	@DataProvider
//	public Iterator<Object[]> groupsFromFile() throws IOException {
//		return wrapGroupsForDataProvider(loadGroupsFromXmlFile(new File("groups.xml"))).iterator();
//	}
//
//	// v2. test method will receive test data out of an external file
//	// (groupsFromFile)
//	
//	
	Connection conn = null;
	CallableStatement stmt = null;	

	public StoredProcedure1Test(Connection conn) {
		super();
		this.conn = conn;
	}
	
	@Test
//	
//	@Test(dataProvider = "groupsFromFile")
	public void executeStatement() {
		try {

			String sql = "{call nna_test_case_template ('59', '1', 'NSC', 1, 1, 1, 1, 2,''  ,'', 1, 3, 0, null, 1, 2)}";
			stmt = conn.prepareCall(sql);

			// Bind IN parameter first, then bind OUT parameter
			int empID = 102;
			stmt.setString(1, "Test");
			stmt.setInt(1, empID); // This would set ID as 102
			// Because second parameter is OUT so register it
			stmt.registerOutParameter(2, java.sql.Types.VARCHAR);

			// Use execute method to run stored procedure.
			System.out.println("Executing stored procedure...");
			stmt.execute();

			// Retrieve employee name with getXXX method
			String empName = stmt.getString(2);
			System.out.println("Emp Name with ID:" + empID + " is " + empName);
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
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
