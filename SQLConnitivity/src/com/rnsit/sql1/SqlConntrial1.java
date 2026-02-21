package com.rnsit.sql1;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConntrial1 {

    public Connection Match() {

        String url = "jdbc:mysql://localhost:3306/rnsit";
        String user = "root";
        String password = "Subbu@895";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            return con;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
