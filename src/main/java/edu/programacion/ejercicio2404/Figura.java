package edu.programacion.ejercicio2404;

public class Figura {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }

    public void pintar() {
        System.out.println("Pintando figura " + color);
    }


}
