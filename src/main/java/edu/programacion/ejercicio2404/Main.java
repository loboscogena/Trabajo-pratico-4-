package edu.programacion.ejercicio2404;

public class Main {

    public static void main(String[] args) {

        EditorFiguras editor = new EditorFiguras();

        Cuadrado cuadrado = new Cuadrado(4, "Rojo");
        Circulo circulo = new Circulo(3, "Azul");
        Triangulo triangulo = new Triangulo(6, 4, "Verde");
        Linea linea = new Linea(0, 0, 5, 5, "Negro");

        editor.agregarFigura(cuadrado);
        editor.agregarFigura(circulo);
        editor.agregarFigura(triangulo);
        editor.agregarFigura(linea);

        System.out.println("=== Figuras ===");
        editor.pintar();

        System.out.println("\n=== Área total ===");
        System.out.println(editor.calcularArea());
    }
}
