package com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.clases_abstractas.elementos.validador;

public class NumeroValidador extends Validador{

    protected String mensaje="El campo debe ser un número";
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
      try {
          Integer.parseInt(valor);
          return true;// Si lo convierte a entero devuelve true, si no, atrapa la excepción lanzada
      }catch (NumberFormatException e){
            return false;
      }
    }
}
