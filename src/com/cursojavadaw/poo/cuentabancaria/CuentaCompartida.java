package com.cursojavadaw.poo.cuentabancaria;

import java.util.ArrayList;

public class CuentaCompartida extends CuentaBancaria{
    private CuentaBancaria cuenta;
    private Persona primerPropietario;
    private ArrayList<Persona> propietarios= new ArrayList<Persona>();

    public CuentaCompartida(double saldo, String tipo, Persona persona, String contraseña) {
        super(saldo, tipo, persona, contraseña);
        this.primerPropietario=persona;
        this.propietarios.add(this.primerPropietario);
    }


    public void anhadirPropietario(CuentaCompartida cuenta, Persona propietario){
        this.cuenta=cuenta;
        if(this.propietarios.contains(propietario))System.out.println("Este propietario ya está registrado");
        else 
        this.propietarios.add(propietario); 
        System.out.println("Se agregó un nuevo propietario");
        mostrarPropietarios();
    }
    public void mostrarPropietarios(){
       for(Persona prop : propietarios) System.out.println(prop.toString());
    }

}
