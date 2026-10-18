package edu.programacion.ejercicio2405;

public class Libro {
    private String titulo;
    private String autor;
    private String fechaPublicacion;
    private String personajes;
    private int copias;

    public Libro(String titulo, String autor, String fechaPublicacion,
                 String personajes, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.personajes = personajes;
        this.copias = copias;
    }

    public int getCopias() {
        return copias;
    }

}
