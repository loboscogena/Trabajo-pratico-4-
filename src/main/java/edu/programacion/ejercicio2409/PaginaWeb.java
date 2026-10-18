package edu.programacion.ejercicio2409;

public class PaginaWeb {
    private String direccion;
    private String fechaVisita;
    private double tamanio;
    private String codigo;

    public PaginaWeb(String direccion, String fechaVisita,
                     double tamanio, String codigo) {
        this.direccion = direccion;
        this.fechaVisita = fechaVisita;
        this.tamanio = tamanio;
        this.codigo = codigo;
    }

    public String direccion() {
        return direccion;
    }

    public String fecha() {
        return fechaVisita;
    }

    public double tamanio() {
        return tamanio;
    }

    public String codigo() {
        return codigo;
    }
}
