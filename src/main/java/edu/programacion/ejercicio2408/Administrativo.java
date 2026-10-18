package edu.programacion.ejercicio2408;

public class Administrativo extends Empleado {
    private int categoria;
    private int antiguedad;

    public Administrativo(String nombre, String dni, String direccion,
                          int anioNacimiento, String sexo ,
                          int categoria, int antiguedad) {

        super(nombre, dni, direccion, anioNacimiento, sexo, 0) ;

        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldo() {
        return antiguedad * categoria ;
    }

}

