package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

    public static final String SQL = "update user_tbl set user_name='Bruce', password='tt@12345' where id = 2";

    public static void main(String[] args) {

        try (
                Statement st = DbUtil.getConnection().createStatement();//tablecreatedemo ko try() lai modify gareko
        ) {

            //4. Execute the query
            st.executeUpdate(SQL);
            System.out.println("data updated");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }

    }
}
