package com.cursojavadaw.poo.cuentabancaria;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String cedula;
    private int edad;
    private String ciudad;
    private String profesion;

    private ArrayList<CuentaBancaria> cuentas=new ArrayList<CuentaBancaria>();


    public Persona(String nombre, String cedula, int edad, String ciudad, String profesion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.profesion = profesion;
        if(edad>0){
            this.edad=edad;

        }else{
           throw  new IllegalArgumentException("Ingresó una edad inválida");

        }


    }

    public String getNombre() {
        return nombre;
    }
    public String getTipo(){
        if(cuentas.size()==1) return cuentas.getFirst().getTipo();
        else return cuentas.getFirst().getTipo()+", "+cuentas.get(1).getTipo();
    }
    protected void agregarCuenta(CuentaBancaria cuenta){
        boolean contiene=cuentas.contains(cuenta);
       if(contiene) System.out.println("Cuenta ya registrada a nombre de: "+getNombre());
       else if(cuentas.size()==2)System.out.println("Máxima cantidadde cuentas registradas alcanzado");
       else{
        cuentas.add(cuenta);
        System.out.println("Se añadió una nueva cuenta a nombre de: "+getNombre());
       }
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + '\'' +
                ", cedula='" + this.cedula + '\'' +
                ", edad=" + this.edad +
                ", ciudad='" + this.ciudad + '\'' +
                ", profesion='" + this.profesion + '\'' +
                '}';
    }
}
