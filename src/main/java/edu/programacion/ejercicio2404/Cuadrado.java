package edu.programacion.ejercicio2404;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado, String color) {
        this.lado = lado;
        setColor(color);
    }

    public double getArea() {
        return lado * lado;
    }

    public void pintar() {
        System.out.println("Pintando cuadrado " + getColor());
    }
}
