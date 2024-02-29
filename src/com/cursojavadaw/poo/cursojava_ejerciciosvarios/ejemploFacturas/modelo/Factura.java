package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejemploFacturas.modelo;

import java.time.LocalDate;
import java.util.ArrayList;


public class Factura {
    private Cliente cliente;

    private ArrayList<ItemFactura> items=new ArrayList<>();
    private Integer folio;
    private String descripcion;
    private LocalDate fecha=LocalDate.now();

    public Factura() {
    }

    public Factura(Cliente cliente, String descripcion, Integer folio) {
        this.folio=folio;
        this.descripcion=descripcion;
        this.cliente = cliente;
    }

    public void agregarItem(ItemFactura itemFactura){

        if(itemFactura!=null) this.items.add(itemFactura);


    }
    public Double calcularTotal(){
        double total= 0;
        for(ItemFactura i: this.items){
           total+=i.getProducto().getPrecio()*i.getCantidad(); // Me ahorré el metodo calcular importe
       }
       return total;
    }
    public void verDetalle() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Factura a nombre de: " + this.cliente + " total " + calcularTotal() + " fecha " + this.fecha + " descripción " + this.descripcion + " folio " + this.folio);
        sb.append("\n\t Productos:"+"\n");
        items.sort(ItemFactura::compareTo);
        for(ItemFactura itm: this.items){

            sb.append("\nid: "+itm.getProducto().getCodigo()).append("\t"+
                    itm.getCantidad()+
                    "\t"+itm.getProducto().getNombre()).append("\t Precio Unitario= ").append("\t"+itm.getProducto().getPrecio());
        }
        System.out.println(sb);
    }


}
