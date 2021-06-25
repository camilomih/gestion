package com.aplicacionmovil.gestion.consult;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GeneralConnection {


    public Connection getConnection(){
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(
                    "jdbc:mysql://database-2.cybt6irrev7m.us-east-2.rds.amazonaws.com:3306/aplicacion","admin","12345678");
            System.out.println("Success");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}

