package com.bootcoding.tokendb;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedToken {
    public void prepared(){
        try{
            Class.forName("org.postgresql.Driver");

            Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "aman");
             Statement statement=connection.createStatement();

//            PreparedStatement preparedStatement=statement.execute();
        }catch (Exception e){

        }
    }
}
