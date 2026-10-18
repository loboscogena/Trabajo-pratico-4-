package edu.programacion.ejercicio2408;


public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Tecnico tecnico = new Tecnico(
                "Juan", "12345678", "Rojas",
                1995, "M", 500000
        );

        Administrativo administrativo = new Administrativo(
                "Pedro", "87654321", "Rojas",
                1990, "M", 3, 5
        );

        empresa.agregarEmpleado(tecnico);
        empresa.agregarEmpleado(administrativo);

        System.out.println("Monto total de sueldos: "
                + empresa.montoTotal());
    }
}
