package com.cursojavadaw.poo.cursojava_ejerciciosvarios.proyectoOrdenDeCompra;

public class mainEjercicio {
    public static void main(String[] args) {
        Cliente c1=new Cliente("Anthony","Medina");
        Producto p1=new Producto("Sony","Audífonos",22350);
        OrdenCompra orden1=new OrdenCompra("Compra de materiales tecnológicos",c1);
        Producto p2= new Producto("Asus","Teclado",30550);

        orden1.addProducto(p1);
        orden1.addProducto(p2);
        orden1.verOrden();


    }


}
