package com.jdbc_connection;
import java.sql.*;
import java.util.Scanner;

public class PreparedStatementWay {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "7575";
        Connection connect = DriverManager.getConnection(url, user, password);

        String query = "INSERT INTO studentInfo (id, sname, sage, scity) VALUES (?, ?, ?, ?)";
        PreparedStatement prp = connect.prepareStatement(query);

        System.out.println("Please enter the following details to be stored in DB");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id: ");
        int id = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your city: ");
        String city = sc.next();

        prp.setInt(1, id);
        prp.setString(2, name);
        prp.setInt(3, age);
        prp.setString(4, city);

        // now after setting parameters execute
        int rowsAffected = prp.executeUpdate();

        if(rowsAffected == 0) {
            System.out.println("Operation failed");
        } else {
            System.out.println("Operation success");
        }

        sc.close();
        connect.close();
    }
}
