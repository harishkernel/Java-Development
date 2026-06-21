package com.jdbc_connection;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // establishing connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "7575";
        Connection connect = DriverManager.getConnection(url, user, password);

        // creating statement
        Statement statement = connect.createStatement();

//        String sql = "INSERT INTO studentInfo(id, sname, sage, scity) VALUES (2, 'Rohit', 18, 'Bengaluru')";
        String sql  = "UPDATE studentInfo set sage = 24 where id = 2";
        // execute query
        int rowsAffected = statement.executeUpdate(sql);

        // process the result
        if(rowsAffected == 0) {
            System.out.println("Operation failed");
        } else {
            System.out.println("Operation successful");
        }

        // close the resources
        statement.close();
        connect.close();
    }
}
