package com.antony.DAO;

import com.antony.modelo.Producto;
import com.antony.repositorio.MetodosBD;
import java.sql.*;
import java.util.*;

public class ProductoDAO  implements MetodosBD {
    PreparedStatement ps;
    ResultSet rs;
    public ProductoDAO()  {
    }


    @Override
    public void editar(Producto prod) {
        String sql="UPDATE producto SET nombre = ?, tipo = ?, cantidad = ? WHERE codigo = ?";
        try (Connection con = ConexionBD.conectar()) {
            ps=con.prepareStatement(sql);
            ps.setString(1, prod.getNombre());
            ps.setString(2,prod.getTipo());
            ps.setInt(3,prod.getCantidad());
            ps.setInt(4,prod.getCodigo());
            int filasActualizadas=ps.executeUpdate();
            if(filasActualizadas>0){
                System.out.println("Producto actualizado correctamente");

            }else System.out.println("El producto no se pudo actualizar");
        }
        catch (SQLException e){
            e.getMessage();
        }
    }

    @Override
    public void insertar(Producto producto) {

        String sql = "INSERT INTO producto (codigo, nombre, tipo, cantidad) VALUES (?, ?, ?, ?)";
        try{
            Connection con=ConexionBD.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, producto.getCodigo());
            ps.setString(2,producto.getNombre());
            ps.setString(3,producto.getTipo());
            ps.setInt(4,producto.getCantidad());

            int filaAgregada=ps.executeUpdate();
            if(filaAgregada>0){
                System.out.println("Producto insertado correctamente");
            }
            else{
                System.out.println("No se pudo insertar el producto en la BD");
            }

        }
        catch (SQLException e) {
            System.out.println("Error al insertar el producto en la base de datos: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(Integer codigo) {
        String sql = "DELETE FROM producto WHERE codigo = ?";
        try{
            Connection con=ConexionBD.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, codigo);
            int filaModificada=ps.executeUpdate();
            if(filaModificada>0){
                System.out.println("Producto eliminado correctamente");
            }
            else{
                System.out.println("No se pudo eliminar el producto en la BD");
            }
            con.close();
        }
        catch (SQLException e) {
            System.out.println("Error al eliminar el producto de la base de datos: " + e.getMessage());
        }
    }

    @Override
    public List<Producto> listar() {


        List<Producto> productos=new ArrayList<>();
        String sql= "select * from producto";
        try{
            Connection con=ConexionBD.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                productos.add(new Producto(rs.getInt("codigo"),
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getInt("cantidad")));

        }
            con.close();
            System.out.println("Conexión cerrada exitosamente");


        }
        catch (SQLException e){
            e.getMessage();

        }
        return productos;
    }
}
