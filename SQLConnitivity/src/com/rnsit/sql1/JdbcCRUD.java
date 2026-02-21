package com.rnsit.sql1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcCRUD {

    Connection con;
    SqlConntrial1 myCon;

    public JdbcCRUD() {
        myCon = new SqlConntrial1();
        con = myCon.Match();
    }

    public void insertEmployee(Employee employee) {

        String myquery = "INSERT INTO employees VALUES (?,?,?,?)";

        try {
            PreparedStatement pstmt = con.prepareStatement(myquery);

            pstmt.setString(1, employee.getEmpId());
            pstmt.setString(2, employee.getEmpName());
            pstmt.setString(3, employee.getEmpAdd());
            pstmt.setInt(4, employee.getEmpSal());

            pstmt.executeUpdate();

            System.out.println("Employee inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        JdbcCRUD jdbcC = new JdbcCRUD();

        Employee emp = new Employee("E102", "Sike", "Bangalore", 50000);
        Employee emp1 = new Employee("E101", "Sike", "Bangalore", 50000);
        jdbcC.insertEmployee(emp);
        jdbcC.insertEmployee(emp1);
        
    }
}
