package com.jdbc_connection;

import java.sql.*;

public class RetrievalQueries {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        // load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // establish the connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "7575";
        Connection connect = DriverManager.getConnection(url, user, password);

        // creating statement
        Statement statement = connect.createStatement();

        // execute query
        String sql = "select * from studentInfo";
        ResultSet rs = statement.executeQuery(sql);

        // process query
        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
        }

        // close the connections
        rs.close();
        statement.close();
        connect.close();
    }
}
