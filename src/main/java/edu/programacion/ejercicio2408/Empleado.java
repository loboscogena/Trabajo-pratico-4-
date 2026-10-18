package edu.programacion.ejercicio2408;

public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, String dni, String direccion,
                    int anioNacimiento, String sexo, double sueldo) {
        super(nombre, dni, direccion, anioNacimiento, sexo);
        this.sueldo = sueldo;
    }

    public double calcularSueldo() {
        return sueldo;
    }
}
