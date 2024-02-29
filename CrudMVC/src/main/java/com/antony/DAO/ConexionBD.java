package com.antony.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {


    public static Connection conectar() throws SQLException {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PRODUCTOS"
                    , "root"
                    , "Morado2407");
            System.out.println("Conexión exitosa");
            return con;
        } catch (SQLException e) {
            e.getMessage();
            throw e;
        }

    }




}
