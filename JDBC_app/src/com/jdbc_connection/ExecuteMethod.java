package com.jdbc_connection;
import java.sql.*;

public class ExecuteMethod {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "7575";
        Connection connect = DriverManager.getConnection(url, user, password);
        Statement statement = connect.createStatement();

        String sql = "SELECT * FROM studentInfo";

        // all CRUD operations can be executed using statement.execute() method
        boolean status = statement.execute(sql);


        // if sql = SELECT statement => status = true,
        // if sql = NON SELECT operation => status = false
        if(status == true) {
            // SELECT
            ResultSet rs = statement.getResultSet();
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("sname") + " " + rs.getInt("sage") + " " + rs.getString("scity"));
            }
        } else {
            // INSERT, UPDATE, DELETE
            int rowsAffected = statement.getUpdateCount();
            if(rowsAffected == 0) {
                System.out.println("No rows have been affected");
            } else {
                System.out.println(rowsAffected + "have been affected");
            }
        }
        statement.close();
        connect.close();
    }
}
