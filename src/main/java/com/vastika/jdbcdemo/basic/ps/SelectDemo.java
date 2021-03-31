package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

    //public static final String SQL = "select * from user_tbl";
    public static final String SQL = "select * from user_tbl where user_name = ? and password = ?";

    public static void main(String[] args) {

        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);

        ) {
            ps.setString(1, "Natalia");
            ps.setString(2, "Nat@xxx");
            //4. Execute the query
            ResultSet rs = ps.executeQuery(); //databse bata java ma data lyaeko vara
            while (rs.next()) {
                System.out.println("=========");
                System.out.println("Id is: " + rs.getInt("id"));
                System.out.println("Username is: " + rs.getString("user_name"));
                System.out.println("Password is: " + rs.getString("password"));
                System.out.println("==========");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}

