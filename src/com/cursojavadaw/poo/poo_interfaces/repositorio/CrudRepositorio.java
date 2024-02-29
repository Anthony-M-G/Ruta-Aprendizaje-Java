package com.cursojavadaw.poo.poo_interfaces.repositorio;

import com.cursojavadaw.poo.poo_interfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T>{

    List<T> listar();
    T obtenerPorId(Integer id);
    void insertar(T cliente);
    void editar(T cliente);
    void eliminarPorId(Integer id);


}
