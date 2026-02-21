package com.rnsit.sql1;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcCRUDSir {
	Connection sqlcon;
	Statement Stmt;
	PreparedStatement pstmt;
	SqlConntrial1 myCon;
	ResultSet rs;
	
	public JdbcCRUDSir() {
		// TODO Auto-generated constructor stub
		myCon =new SqlConntrial1();
		
	}
	
	public void getallemp() {
		// TODO Auto-generated method stub
		sqlcon=myCon.Match();
		try {
			Stmt=sqlcon.createStatement();
			String query = "select * from employees";
			rs = Stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1)+" :  "+rs.getString(2)+"  :  "+rs.getString(3)+"  :   "+rs.getString(4));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void getempbyid(String empid) {
		// TODO Auto-generated method stub
		sqlcon =myCon.Match();
		String query="select * from employees where empid=?";
		try {
			pstmt = sqlcon.prepareStatement(query);
			pstmt.setString(1, empid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString("empName"));
				System.out.println(rs.getString("empAdress"));
				System.out.println(rs.getString("empSalary"));
			}else {
				System.out.println("employee not found");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteemp(String empid) {
		// TODO Auto-generated method stub
		sqlcon =myCon.Match();
		String query ="delete From employees where empid=?";
		try {
			pstmt=sqlcon.prepareStatement(query);
			pstmt.setString(1, empid);
			int row = pstmt.executeUpdate();
			System.out.println(row+"row has being deleted");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateemp(Employee emp) {
		// TODO Auto-generated method stub
		sqlcon = myCon.Match();
		String query = "update employees set empName=?, empAdress=?, empSalary=? where empid=?";
		try {
			pstmt = sqlcon.prepareStatement(query);
	        pstmt.setString(1, emp.getEmpName());
	        pstmt.setString(2, emp.getEmpAdd());
	        pstmt.setInt(3, emp.getEmpSal());
	        pstmt.setString(4, emp.getEmpId());

	        int row = pstmt.executeUpdate();
	        System.out.println(row + " Row Updated");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertemp(Employee emp) {

	    sqlcon = myCon.Match();
	    String query = "INSERT INTO employees (empid, empName, empAdress, empSalary) VALUES (?,?,?,?)";

	    try {
	        pstmt = sqlcon.prepareStatement(query);
	        pstmt.setString(1, emp.getEmpId());
	        pstmt.setString(2, emp.getEmpName());
	        pstmt.setString(3, emp.getEmpAdd());
	        pstmt.setInt(4, emp.getEmpSal());

	        int row = pstmt.executeUpdate();
	        System.out.println(row + " Row Inserted Successfully");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcCRUDSir jd=new JdbcCRUDSir();
//		jd.getallemp();
	    Employee emp = new Employee("E208", "Sike", "Bangalore", 70000);
	    
		jd.insertemp(emp);
		
	    jd.getempbyid("E208");
//	    emp.setEmpName("Sbbu");
	    
//	    jd.updateemp(emp);

//	    jd.deleteemp("E200");
//	    jd.getallemp();
	}

}
