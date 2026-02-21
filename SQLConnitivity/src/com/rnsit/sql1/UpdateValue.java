package com.rnsit.sql1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con =new SqlConntrial1().Match();
		Statement stmt=con.createStatement();
		String updateQuery="UPDATE employees set empName='Subash',empSalary=600 where empid='E107'";
		try {
			int data = stmt.executeUpdate(updateQuery);
			System.out.println(data+"record done");
		}catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}

}
