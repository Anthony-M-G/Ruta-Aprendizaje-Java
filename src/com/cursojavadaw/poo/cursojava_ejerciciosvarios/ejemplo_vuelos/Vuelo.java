package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejemplo_vuelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
public class Vuelo implements Comparable<Vuelo>{
    private String origen;
    private String destino;
    private Integer cantidadPasajeros;
    private LocalDateTime fecha;

    @Override
    public String toString() {
        return
                this.origen +" -> "+this.destino+ " "+this.getFecha().toString()+" pasajeros "+this.cantidadPasajeros
              ;
    }

    @Override
    public int compareTo(Vuelo o) {
        return this.fecha.compareTo(o.getFecha());
    }



}
