package com.antony.vista;

import com.antony.DAO.ConexionBD;
import com.antony.DAO.ProductoDAO;
import com.antony.controlador.Controlador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

public class CrudMVC extends JFrame{
    private JTable tabla;
    private JTextField entradaCantidad;
    private JButton eliminarBtn;
    private JTextField entradaTipo;
    private JButton editarBtn;
    private JTextField entradaNombre;
    private JButton mostratBtn;
    private JTextField entradaCodigo;
    private JButton agregarBtn;
    private JLabel codigoText;
    private JLabel nombreText;
    private JLabel tipoText;
    private JLabel cantidadText;
    private JPanel panel;
    Controlador con=new Controlador();
    ProductoDAO prodDao=new ProductoDAO();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    // Agregar las columnas al modelo de tabla
    Connection conect= ConexionBD.conectar();





    public CrudMVC() throws SQLException {
        agregarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    con.insertar(Integer.parseInt(entradaCodigo.getText())
                            ,entradaNombre.getText()
                            ,entradaTipo.getText()
                            ,Integer.parseInt(entradaCantidad.getText()));
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                con.listar(tabla,modeloTabla);


            }
        });
        mostratBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloTabla.setColumnIdentifiers(new String[]{"Codigo", "Nombre", "Tipo", "Cantidad"});
                con.listar(tabla,modeloTabla);


            }
        });
        editarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con.editar(tabla);
                con.listar(tabla,modeloTabla);



            }
        });
        eliminarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabla.removeAll();
                con.eliminar(tabla);
                con.listar(tabla,modeloTabla);



            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
