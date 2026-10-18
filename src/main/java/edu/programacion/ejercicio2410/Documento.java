package edu.programacion.ejercicio2410;

import java.util.ArrayList;
import java.util.List;

public class Documento {

    private String nombre;
    private String texto;
    private String fechaCreacion;
    private Editor dueno;
    private List<Editor> editores;

    public Documento(String nombre, String texto,
                     String fechaCreacion, Editor dueno) {
        this.nombre = nombre;
        this.texto = texto;
        this.fechaCreacion = fechaCreacion;
        this.dueno = this.dueno;
        this.editores = new ArrayList<>();
    }

    public int cantidadEditores() {
        return editores.size();
    }

    public void agregarEditor(Editor editor) {
        editores.add(editor);
    }
}