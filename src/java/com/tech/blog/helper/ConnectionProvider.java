package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider 
{
    private static Connection conn;
    
    public static Connection getConnection()
    {
        try
        {
            if(conn==null)
            {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Loaded SucessFully!!!!");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//MSI:1521/XE","blog","tech");
            System.out.println("Connection open Sucessfully!!!!");
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        catch(ClassNotFoundException cnfe)
        {
            cnfe.printStackTrace();
        }
        return conn;
    }
}
