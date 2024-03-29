package com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.clases_abstractas.elementos;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.clases_abstractas.elementos.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor; //La clases hijas pueden acceder a este atributo
    protected String nombre;
    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores=new ArrayList<>();
        this.errores=new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }
    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public boolean esValido(){
      for(Validador v: validadores){
          if(!v.esValido(this.valor)){
              this.errores.add(v.getMensaje());
          }
      }
      return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();

    @Override
    public String toString() {
        return this.nombre;
    }
}
