package com.antony.controlador;

import com.antony.DAO.ConexionBD;
import com.antony.DAO.ProductoDAO;
import com.antony.modelo.Producto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Controlador{
    ProductoDAO prodDao=new ProductoDAO();

    public Controlador() throws SQLException {
    }
    public void editar(JTable jTable){
        int codigo=Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(),0).toString());
        String nombre= jTable.getValueAt(jTable.getSelectedRow(),1).toString();
        String tipo= jTable.getValueAt(jTable.getSelectedRow(),2).toString();
        int cantidad=Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(),3).toString());
        prodDao.editar(new Producto(codigo, nombre, tipo, cantidad));
    }

    public void insertar(int codigo, String nombre, String tipo, int cantidad) throws SQLException {
        Connection con= ConexionBD.conectar();
        try(con){
            if(cantidad>0 && codigo>0){
            prodDao.insertar(new Producto(codigo, nombre, tipo, cantidad));
        }else {
            System.out.println("Valor ingresado inválido");
        }
        }catch (SQLException e){
            e.getMessage();
        }finally {
            con.close();
            System.out.println(con.isClosed());
        }

    }
    public void eliminar(JTable j){

        Integer valorFila=Integer.parseInt(j.getValueAt(j.getSelectedRow(),0).toString());
        try{prodDao.eliminar(valorFila);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void listar(JTable jt ,DefaultTableModel defaultTable) {
        actualizarTabla(defaultTable);
        // Obtener la lista de productos del ProductoDAO
        List<Producto> productos = prodDao.listar();
        // Iterar sobre la lista de productos y agregar cada producto como una fila en el modelo de tabla
        for (Producto producto : productos) {
            defaultTable.addRow(new Object[]{String.valueOf(producto.getCodigo())
                                            , producto.getNombre(), producto.getTipo()
                                            , String.valueOf(producto.getCantidad())});
        }
        // Establecer el modelo de tabla en la JTable
        jt.setModel(defaultTable);
    }
    public void actualizarTabla(DefaultTableModel mod){
        mod.getDataVector().removeAllElements();
        mod.fireTableDataChanged();

    }
    }



