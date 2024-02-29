package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejemploFacturas;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejemploFacturas.modelo.*;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un cliente con nombre "Anthony" y número de identificación "2407A"
        Cliente c1 = new Cliente("Anthony", "2407A");

        // Solicitar al usuario que ingrese la descripción y el folio de la factura
        System.out.println("Ingrese la descripción y folio");
        String desc = sc.nextLine(); // Leer la descripción
        int folio = sc.nextInt();     // Leer el folio
        sc.nextLine();                // Consumir el carácter de nueva línea

        // Crear una nueva factura con el cliente, la descripción y el folio ingresados
        Factura f1 = new Factura(c1, desc, folio);

        // Bucle para ingresar los detalles de los productos
        int i = 0;
        while (i < 3) { // Repetir tres veces (como se indica en el enunciado)
            // Solicitar al usuario que ingrese los datos del producto: nombre, precio y cantidad
            System.out.println("Ingrese los datos del producto: nombre, precio, cantidad: ");
            String nombre = sc.nextLine(); // Leer el nombre del producto
            double precio = sc.nextDouble(); // Leer el precio del producto
            int cantidad = sc.nextInt();     // Leer la cantidad del producto
            sc.nextLine(); // Consumir el carácter de nueva línea

            // Agregar un nuevo ítem a la factura con el producto, precio y cantidad ingresados
            f1.agregarItem(new ItemFactura(new Producto(nombre, precio), cantidad));

            // Incrementar el contador del bucle
            i++;
        }

        // Calcular el total de la factura
        f1.calcularTotal();

        // Mostrar los detalles de la factura
        f1.verDetalle();

    }
}

