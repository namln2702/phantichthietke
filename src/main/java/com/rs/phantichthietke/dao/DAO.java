package com.rs.phantichthietke.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

    public Connection con = null;

    public DAO(){
        try {
            Class.forName("org.postgresql.Driver");
            String URL  = "jdbc:postgresql:qlnh_pttk?user=postgres&password=password";
            con = DriverManager.getConnection(URL);

            if(con != null){
                System.out.println("Connected DB");
            }
            else System.out.println("Not Connect DB");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
