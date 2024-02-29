package com.cursojavadaw.poo.cuentabancaria;

public class CuentaBancaria {
    private Persona propietario;
    private String tipo;
    private double saldo;
    private String contraseña;
    public CuentaBancaria(double saldo, String tipo, Persona persona, String contraseña){
        this.propietario =persona;
        this.tipo=tipo;
        this.saldo=saldo;
        this.contraseña=contraseña;
        this.propietario.agregarCuenta(CuentaBancaria.this);
    }
    public String cambiarTipoCuenta(String nuevoTipo){
        this.tipo=nuevoTipo;
        return nuevoTipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void retirar(double retiro, String clave){
        if(autenticacion(clave)){
            if(retiro<=saldo) saldo -= retiro;
            else System.out.println("Fondos insuficientes");}
        else{
            System.out.println("Clave ingresada inválida");
        }
        System.out.println("Saldo actual: " + this.saldo);
    }

    public void depositar(double ingreso, String clave){
        if(autenticacion(clave)){
            if(ingreso>0) saldo += ingreso;
            else System.out.println("Monto inválidos");
        }else{
            System.out.println("Clave ingresada inválida");
        }
        System.out.println("Saldo actual: " + this.saldo);
    }
    public boolean autenticacion(String clave){
        if(clave==this.contraseña) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "CuentaBancaria de " +
                "persona=" + propietario.getNombre() +
                ", tipo=" + tipo
                ;
    }

}
