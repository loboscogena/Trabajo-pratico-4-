package edu.programacion.ejercicio2410;

import java.util.ArrayList;
import java.util.List;

public class SistemaDocumentos {

    private Editor dueno;
    private String idioma;
    private String fechaCreacion;
    private List<Documento> documentos;

    public SistemaDocumentos(Editor dueno, String idioma,
                             String fechaCreacion) {
        this.dueno = dueno;
        this.idioma = idioma;
        this.fechaCreacion = fechaCreacion;
        this.documentos = new ArrayList<>();
    }

    public int cantidadDocumentos() {
        return documentos.size();
    }

    public int cantidadEditores(Documento documento) {
        return documento.cantidadEditores();
    }

    public int cantidadTotalEditores() {
        int total = 0;

        for (Documento documento : documentos) {
            total += documento.cantidadEditores();
        }

        return total;
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public void agregarEditor(Documento documento, Editor editor) {
        documento.agregarEditor(editor);
    }
}