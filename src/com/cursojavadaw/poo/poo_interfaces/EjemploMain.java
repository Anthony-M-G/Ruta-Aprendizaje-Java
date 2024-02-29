package com.cursojavadaw.poo.poo_interfaces;

import com.cursojavadaw.poo.poo_interfaces.modelo.Cliente;
import com.cursojavadaw.poo.poo_interfaces.repositorio.ClienteListRepositorio;
import com.cursojavadaw.poo.poo_interfaces.repositorio.CrudRepositorio;
import com.cursojavadaw.poo.poo_interfaces.repositorio.PaginableRepositorio;

import java.util.List;

public class EjemploMain {
    public static void main(String[] args) {

        CrudRepositorio<Cliente> repo=new ClienteListRepositorio();
        repo.insertar(new Cliente("Juan","Alvarado"));
        repo.insertar(new Cliente("Juana","Alva"));
        repo.insertar(new Cliente("Axel","Alvareda"));
        repo.insertar(new Cliente("Zamia","Alma"));

        List<Cliente> clientes=repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("======================================================");
        List<Cliente> paginables=((PaginableRepositorio) repo).listar(1,3);
        paginables.forEach(System.out::println);

    }
}
