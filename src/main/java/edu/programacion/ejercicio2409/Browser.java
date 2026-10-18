package edu.programacion.ejercicio2409;
import java.util.ArrayList;
import java.util.List;

public class Browser {
    private PaginaWeb paginaActual;
    private Historial historial;
    private List<String> favoritos;

    public Browser() {
        historial = new Historial();
        favoritos = new ArrayList<>( );
    }

    public void navegar(PaginaWeb pagina) {
        paginaActual = pagina;
        historial.agregarPaginas(pagina);
    }

    public void agregarFavorito(String direccion) {
        favoritos.add(direccion);
    }

    public void eliminarFavorito(String direccion) {
        favoritos.remove(direccion);
    }

    public PaginaWeb paginaActual()  {
        return paginaActual;
    }

    public Historial historial() {
        return historial;
    }
}