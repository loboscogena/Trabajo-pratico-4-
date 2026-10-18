package edu.programacion.ejercicio2402;

public class Main {

    public static void main(String[] args) {

        Album album = new Album("Vacaciones");

        Foto foto1 = new Foto("Playa");
        Foto foto2 = new Foto("Montaña");

        album.agregarFoto(foto1);
        album.agregarFoto(foto2);

        System.out.println("Nombre: " + album.getNombre());
        System.out.println("Cantidad de fotos: " + album.cantidadDeFotos());
    }
}