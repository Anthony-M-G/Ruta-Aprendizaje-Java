package com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.clases_abstractas.form;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.clases_abstractas.elementos.*;
import com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.clases_abstractas.elementos.select.Opcion;
import com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.clases_abstractas.elementos.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username=new InputForm("user");
        username.addValidador(new RequeridoValidados());

        InputForm password=new InputForm("clave","password");
        password.addValidador(new RequeridoValidados()).addValidador(new LargoValidador(4,12));

        InputForm email=new InputForm("email","email");
        email.addValidador(new EmailValidador()).addValidador(new RequeridoValidados());

        InputForm edad=new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia=new TextAreaForm("exp",5,9);

        SelectForm lenguaje=new SelectForm("lenguaje");
        lenguaje.addValidador(new NumeroValidador());
        lenguaje.addValidador(new NoNuloValidador());

        lenguaje.addOpcion(new Opcion("1","Java").setSelected()) // Se modifica el set para que devuelva la misma instancia
                .addOpcion(new Opcion("2","Python"))
                .addOpcion(new Opcion("3","Typescript"))
                .addOpcion(new Opcion("4","C++"))
                .addOpcion(new Opcion("5","Javascript"));

        ElementoForm saludar=new ElementoForm("Saludo") { //Clase anónima
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\""+this.valor+"\">";
            }
        };

        saludar.setValor("Este campo está deshabilitado");


        username.setValor("antony");
        password.setValor("Morado2407");
        email.setValor("antony@gmail.com");
        edad.setValor("");
        experiencia.setValor("4 meses");
        //java.setSelected(true);

        List<ElementoForm> elementos= Arrays.asList(username
                ,password
                ,email,edad
                ,experiencia
                ,lenguaje,saludar);

        elementos.forEach(e->{//Foreach del api collection
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
        elementos.forEach(e-> {
            if(!e.esValido()){
                e.getErrores().forEach(err-> System.out.println(e+": "+err));
            }
        });


    }



}
