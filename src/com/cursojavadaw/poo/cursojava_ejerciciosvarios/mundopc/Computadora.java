package com.cursojavadaw.poo.cursojava_ejerciciosvarios.mundopc;

public class Computadora {
    private Monitor monitor;
    private Mouse mouse;
    private  Teclado teclado;
    private int id;
    private String nombre;

    public Computadora(Monitor monitor, Mouse mouse, Teclado teclado, String nombre) {
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "monitor=" + monitor.toString() +
                ", mouse=" + mouse.toString() +
                ", teclado=" + teclado.toString() +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
