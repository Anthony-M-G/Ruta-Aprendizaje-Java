package com.cursojavadaw.poo.poo_interfaces.repositorio;

import com.cursojavadaw.poo.poo_interfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteListRepositorio extends AbstractListRepositorio{

    private List<Cliente> dataSource;


    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente obtenerPorId(Integer id) {
       for(Cliente cliente: this.dataSource){
           if (Objects.equals(cliente.getId(), id)){
               return cliente;
           }
       }
        System.out.println("Usuario no encontrado");

        return null;
    }

    @Override
    public void insertar(Cliente cliente) {
        this.dataSource.add(cliente);

    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c=this.obtenerPorId(cliente.getId());
        c.setApellido(cliente.getNombre());
        c.setApellido(cliente.getApellido());

    }

    @Override
    public void eliminarPorId(Integer id) {

        this.dataSource.remove( this.obtenerPorId(id));

    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        dataSource.sort((a,b)->{
                int resultado=0;
                if(direccion==Direccion.ASC){
                    this.ordenar(campo,a,b);
                } else if (direccion==Direccion.DESC) {
                   this.ordenar(campo,b,a);
                }
                return 0;
            }
        );
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }

    public int ordenar(String campo,Cliente a, Cliente b ){
        int res=0;
        switch (campo){
            case "id"-> res=a.getId().compareTo(b.getId());
            case "nombre"->res=a.getNombre().compareTo(b.getNombre());
            case "apellido"->res=a.getApellido().compareTo(b.getApellido());

        }
        return res;
    }
}
