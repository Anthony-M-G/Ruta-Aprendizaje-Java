package com.cursojavadaw.poo.poo_interfaces.repositorio;

import com.cursojavadaw.poo.poo_interfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
