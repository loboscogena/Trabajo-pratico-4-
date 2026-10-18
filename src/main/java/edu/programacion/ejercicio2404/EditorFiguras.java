package edu.programacion.ejercicio2404;

import java.util.List;
import java.util.ArrayList;

public class EditorFiguras {


        private List<Figura> figuras;

        public EditorFiguras() {
            figuras = new ArrayList<>();
        }

        public void agregarFigura(Figura figura) {
            figuras.add(figura);
        }

        public void eliminarFigura(Figura figura) {
            figuras.remove(figura);
        }

        public void pintar() {
            for (Figura figura : figuras) {
                figura.pintar();
            }
        }

        public double calcularArea() {
            double total = 0;

            for (Figura figura : figuras) {
                total += figura.getArea();
            }

            return total;
        }

}
