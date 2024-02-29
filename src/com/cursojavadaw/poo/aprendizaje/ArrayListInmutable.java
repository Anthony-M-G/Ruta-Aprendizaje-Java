package com.cursojavadaw.poo.aprendizaje;

import com.cursojavadaw.poo.aprendizaje.Punto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListInmutable {
    private ArrayList<Punto> arrPuntos=new ArrayList<>(); // Declaro e inicializo mi arraylist

    public String getArrPuntos() { //Obtener el array de puntos en string
        this.arrPuntos=objInmutable(arrPuntos); //arrPuntos ahora apunta a la direction de memoria de return copia
        return this.arrPuntos.toString();
    }
    public void guardarPunto(Punto p1) { // Método para guardar cada punto
        arrPuntos.add(p1);
    }

    public ArrayList<Punto> objInmutable(ArrayList<Punto> arrayPuntos){ // Método que hace que el arraylist que recibe como parámetro sea inmutable
        ArrayList<Punto> copia=new ArrayList<>(); // Crea un array que almacenara los puntos inmutables
        for (Punto arrayPunto : arrayPuntos) {
            copia.add(new Punto(arrayPunto.getX(), arrayPunto.getY()));
        }
        return copia; // Retorna el array creado
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(5, 7);
        ArrayListInmutable arrayListInmutable = new ArrayListInmutable();
        arrayListInmutable.guardarPunto(p1);
        arrayListInmutable.guardarPunto(p2);
        System.out.println(arrayListInmutable.getArrPuntos());
        p1.setY(4);
        p2.setY(5);
        System.out.println(arrayListInmutable.getArrPuntos());
    }
}
