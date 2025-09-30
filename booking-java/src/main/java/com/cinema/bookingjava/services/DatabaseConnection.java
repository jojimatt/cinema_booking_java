package com.cinema.bookingjava.services;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {


    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();
        try(FileInputStream fis = new FileInputStream("config.properties")){
            props.load(fis);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        final String URL = props.getProperty("db.url");
         final String USER = props.getProperty("db.user");
       final String PASSWORD = props.getProperty("db.password");

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }


}
