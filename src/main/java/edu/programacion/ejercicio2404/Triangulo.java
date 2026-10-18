package edu.programacion.ejercicio2404;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        setColor(color);
    }

    public double getArea() {
        return (base * altura) / 2;
    }

    public void pintar() {
        System.out.println("Pintando triangulo " + getColor()) ;
    }

}
