package edu.programacion.ejercicio2410;

public class Main {

    public static void main(String[] args) {

        Editor genaro = new Editor("Genaro");
        Editor juan = new Editor("Juan");
        Editor maria = new Editor("Maria");

        SistemaDocumentos sistema =
                new SistemaDocumentos(genaro, "Español", "15/10/2026");

        Documento doc1 = new Documento(
                "Trabajo POO", "Contenido del trabajo",
                "15/10/2026", genaro);

        Documento doc2 = new Documento(
                "Apuntes Java", "Contenido de Java",
                "15/10/2026", genaro);

        sistema.agregarDocumento(doc1);
        sistema.agregarDocumento(doc2);

        sistema.agregarEditor(doc1, juan);
        sistema.agregarEditor(doc1, maria);
        sistema.agregarEditor(doc2, juan);

        System.out.println("Cantidad de documentos: "
                + sistema.cantidadDocumentos());

        System.out.println("Editores del documento 1: "
                + sistema.cantidadEditores(doc1));

        System.out.println("Editores del documento 2: "
                + sistema.cantidadEditores(doc2));

        System.out.println("Cantidad total de editores: "
                + sistema.cantidadTotalEditores());
    }
}