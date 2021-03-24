package com.vastika.jdbcdemo.basic.st;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo {

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_demo_db";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "Temple@1";
    public static final String SQL = "create table user_tbl(id int not null auto_increment, user_name varchar(45), password varchar(45), primary key(id)";

    public static void main(String[] args) {

        try (
                Connection con =DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
                Statement st = con.createStatement();
                ) {

            //4. Execute the query
            st.executeUpdate(SQL);
            System.out.println("table created");

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
