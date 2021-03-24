package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL = "insert into user_tbl(user_name, password) values('Alfred', 'aa@123')";

    public static void main(String[] args) {

        try (
                Statement st = DbUtil.getConnection().createStatement();//tablecreatedemo ko try() lai modify gareko
        ) {

            //4. Execute the query
            st.executeUpdate(SQL);
            System.out.println("data inserted");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }

    }
}
