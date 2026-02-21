package com.rnsit.sql1;
import java.sql.Connection;
import java.sql.Statement;

public class InsertValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = new SqlConntrial1().Match(); Statement stmt =
				con.createStatement();){
			String sql ="INSERT into employees (empid,empName,empAdress,empSalary) values\r\n"+
				"('E107','sikes','RNSIT',500)";
			int row = stmt.executeUpdate(sql);
			System.out.println(row+"Row inserted successfully!!");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
