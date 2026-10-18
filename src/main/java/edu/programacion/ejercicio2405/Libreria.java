package edu.programacion.ejercicio2405;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro unLibro) {
        libros.add(unLibro);
    }

    public void eliminarLibro(Libro unLibro) {
        libros.remove(unLibro);
    }

    public int cantidadDeLibros() {
        return libros.size();
    }

    public int cantidadTotalDeCopias() {
        int total = 0;

        for (Libro libro : libros) {
            total += libro.getCopias();
        }

        return total;
    }

}
