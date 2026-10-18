package edu.programacion.ejercicio2402;


import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nombre;
    private ArrayList<Foto> fotos;

    public Album(String nombre) {
        this.nombre = nombre;
        this.fotos = new ArrayList<Foto>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Foto> getFotos() {
        return fotos;
    }

    public void agregarFoto(Foto foto) {
        this.fotos.add(foto);
    }

    public void agregarFotos(List<Foto> fotos) {
        this.fotos.addAll(fotos);
    }

    public boolean eliminarFoto(Foto foto) {
        return this.fotos.remove(foto);
    }

    public int cantidadDeFotos() {
        return this.fotos.size();
    }

    public void limpiarAlbum() {
        this.fotos.clear();
    }
}