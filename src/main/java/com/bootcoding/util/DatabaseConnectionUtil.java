package com.bootcoding.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectionUtil {
    public static Connection databaseconnection(){
        try{
            //LOAD DATABASE DRIVER
            Class.forName("org.postgresql.Driver");
            //GET DATABASE CONNECTION OBJECT

            Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "aman");

            return conn;
        }catch (Exception e){
            e.printStackTrace();
        }
         return null;
    }
}
