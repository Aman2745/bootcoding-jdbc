package com.bootcoding.tokendb;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TokenApplication {

    public static void main(String[] args) {
        try {
            //Load jdbc Driver
            Class.forName("org.postgresql.Driver");
            //get the connection object
            Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "aman");
            //Statement to Execute Query
            Statement stmt=conn.createStatement();
            //execute query get result
            ResultSet result=stmt.executeQuery("select count(*) from token");

            while(result.next()){
                int count=result.getInt("count");
                System.out.println(count);
            }

            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
