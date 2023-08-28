package com.bootcoding.jdbcusingmethod;

import com.bootcoding.util.DatabaseConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.bootcoding.util.DatabaseConnectionUtil.databaseconnection;

public class JdbcUsingMethod {


    public List<Customers> getAllCustomers(){
        try{

            Connection connection = databaseconnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT * FROM CUSTOMERS";
            ResultSet rs = statement.executeQuery(query);

            // Extract
            List<Customers> customers = new ArrayList<>();
            while(rs.next()){
                // Single Row
                int custId = rs.getInt("customer_id");
                int custId2 = rs.getInt(1);
                String name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesManId = rs.getInt("salesman_id");

                Customers customer = new Customers();
                customer.setCustomer_id(custId);
                customer.setSalesman_id(salesManId);
                customer.setCust_name(name);
                customer.setCity(city);
                customer.setEmail(email);

                customers.add(customer);
            }
            return customers;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public int getTotalCustomerCount(){
        try{
            Connection connection = databaseconnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT count(*) FROM CUSTOMERS";
            ResultSet rs = statement.executeQuery(query);

            if(rs.next()){
                int count = rs.getInt("count");
                return count;
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
    // Get all customers

    // Tell me how many customers we have
    // Tell me how many customer belongs to specific city we have
    // SELECT COUNT(*) from customer where city = 'specific';

    // Get all customers who belong to specific CITY

    // Get all customers which handled by specific salesman

    // Get a Customer by customer Id

    // Business Logic + JDBC Code
}