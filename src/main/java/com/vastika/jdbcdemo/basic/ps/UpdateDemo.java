package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

    public static final String SQL = "update user_tbl set user_name=?, password=? where id = ?";

    public static void main(String[] args) {

        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {

            //4. Execute the query
            ps.setString(1, "Natalia");
            ps.setString(2, "Nat@xxx");
            ps.setInt(3, 1);
            ps.executeUpdate();
            System.out.println("data updated");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }


    }
}
