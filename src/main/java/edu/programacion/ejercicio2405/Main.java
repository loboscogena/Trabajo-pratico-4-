package edu.programacion.ejercicio2405;

public class Main {
    public static void main(String[] args) {

        Libreria libreria = new Libreria();

        Libro libro1 = new Libro(
                "El Principito", "Antoine de Saint-Exupéry",
                "1943", "Principito y zorro", 5
        );

        Libro libro2 = new Libro(
                "Harry Potter", "J. K. Rowling",
                "1997", "Harry y Hermione", 3
        );

        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);

        System.out.println("Cantidad de libros: "
                + libreria.cantidadDeLibros());

        System.out.println("Cantidad total de copias: "
                + libreria.cantidadTotalDeCopias());
        libreria.eliminarLibro(libro1);

        System.out.println("Libros después de eliminar: "
                + libreria.cantidadDeLibros());

        System.out.println("Copias después de eliminar: "
                + libreria.cantidadTotalDeCopias());
    }
}
