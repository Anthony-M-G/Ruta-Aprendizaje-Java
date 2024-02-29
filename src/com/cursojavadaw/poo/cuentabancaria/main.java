package com.cursojavadaw.poo.cuentabancaria;

public class main {
    public static void main(String[] args) {
        Persona Anthony = new Persona("Anthony Medina", "504390315", 22, "Nicoya", "Ingeniero de Software");
        Persona Jose=new Persona("Jose","000001",23,"Nicoya","IT");
        CuentaCompartida cuenta1=new CuentaCompartida(120000,"CA",Anthony,"Morado2407%");
        CuentaBancaria cuenta2=new CuentaBancaria(130000,"CC",Anthony,"Morado2407");
        cuenta1.anhadirPropietario(cuenta1,Jose);
        Jose.agregarCuenta(cuenta1);
        cuenta1.mostrarPropietarios();



        System.out.println(cuenta1.toString());








    }
}
