package com.company;

import java.sql.*;

public class Main {
    // JDBC URL, username and password of MySQL server
    static final String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=UTC";
    static final String user = "root";
    static final String password = "root";

    public static void main(String[] args) {
	try {

	   Connection connection = DriverManager.getConnection(url, user,password );
        String sql = "INSERT INTO workers VALUES (?,?)";
	    PreparedStatement  statement = connection.prepareStatement(sql);
	    statement.setInt(1, 9);
        statement.setString (2, "woww");

        int rows = statement.executeUpdate();
        connection.close();
    }
	catch (SQLException e){
	    e.printStackTrace();
    }
    }
}
