package com.cursojavadaw.poo.poo_interfaces.repositorio;

import com.cursojavadaw.poo.poo_interfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {

    List<T> listar(String campo,Direccion dir);
}
