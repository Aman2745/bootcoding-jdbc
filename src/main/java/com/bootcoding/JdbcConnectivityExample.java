package com.bootcoding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnectivityExample {
    public static void main(String[] args) {
        try{

            //1. Load jdbc driver
            Class.forName("org.postgresql.Driver");

            //2. get database connection object..
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "aman");

            //3. Query database using statement object..
            Statement stmt = conn.createStatement();

            //4. execute query and get ResultSet
            ResultSet rs = stmt.executeQuery("select * from customer");
            //4.1 Extract Result..
            while(rs.next()){

                // single row
                int customer_id = rs.getInt("customer_id");
                String cust_name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email= rs.getString("email");
                int salesman_id= rs.getInt("salesman_id");

                System.out.println("Id = " + customer_id);
                System.out.println("Name = " + cust_name);
                System.out.println("Mail = " + city);
                System.out.println("Address = " + email);
                System.out.println("Phone = " + salesman_id);

            }

            //5. Connection Close;
            conn.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
