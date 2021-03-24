package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertDemo {
    public static final String SQL = "insert into user_tbl(user_name, password) values(?, ?)";

    public static void main(String[] args) {

        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);//tablecreatedemo ko try() lai modify gareko
        ) {

            //4. Execute the query
            ps.setString(1, "Bruno");
            ps.setString(2, "Bruno@xxx");
            ps.executeUpdate();
            System.out.println("data inserted");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }

    }
}
