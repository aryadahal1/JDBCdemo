package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

    public static final String SQL = "delete from user_tbl where id = 4";

    public static void main(String[] args) {

        try (
                Statement st = DbUtil.getConnection().createStatement();//tablecreatedemo ko try() lai modify gareko
        ) {

            //4. Execute the query
            st.executeUpdate(SQL);
            System.out.println("data deleted");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }

    }
}
