package com.antony;

import com.antony.vista.CrudMVC;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Crear una instancia de CrudMVC
        CrudMVC crudMVC = new CrudMVC();

        // Crear un JFrame para mostrar la interfaz de usuario
        JFrame frame = new JFrame("Mi aplicación CRUD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(crudMVC.getPanel()); // panelPrincipal es el contenedor principal de tu interfaz de usuario

        // Empaquetar los componentes y mostrar el JFrame
        frame.pack();
        frame.setVisible(true);
    }
}
