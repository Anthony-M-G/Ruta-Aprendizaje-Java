package com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.clases_abstractas.elementos.validador;

public class RequeridoValidados extends Validador{
    protected String mensaje="El campo es requerido";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor!=null && !valor.isBlank());
    }
}
