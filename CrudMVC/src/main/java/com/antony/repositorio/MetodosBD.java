package com.antony.repositorio;

import com.antony.modelo.Producto;

import java.sql.Connection;
import java.util.List;

public interface MetodosBD {

    public void editar(Producto producto);
    public void insertar(Producto producto);
    public void eliminar(Integer codigo);
    public List<Producto> listar();
}
