package edu.programacion.ejercicio2404;

public class Circulo  extends Figura {
    private double radio;

    public Circulo(double radio, String color) {
        this.radio = radio;
        setColor(color);
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public void pintar() {
        System.out.println("Pintando circulo " + getColor());
    }
}
