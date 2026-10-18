package edu.programacion.ejercicio2404;

public class Linea  extends Figura{
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Linea(double x1, double y1, double x2, double y2, String color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        setColor(color);
    }

    public double getArea() {
        return 0;
    }

    public void pintar() {
        System.out.println("Pintando linea " + getColor());
    }
}

