package com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.clases_abstractas.elementos.validador;

public class EmailValidador extends Validador{
    protected String mensaje="El formato de email es inválido";
    private final static String EMAIL_REGEX="^(.+)@(.+)$";               //Significa que va a validar ^

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;

    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
