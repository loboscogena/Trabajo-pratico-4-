package edu.programacion.ejercicio2409;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<PaginaWeb> paginas;

    public Historial() {
        paginas = new ArrayList<>();
    }

    public void agregarPaginas(PaginaWeb pagina) {
        paginas.add(pagina);
    }

    public void eliminarPaginas(PaginaWeb pagina) {
        paginas.remove(pagina);
    }

    public PaginaWeb ultimaPagina() {
        if (paginas.isEmpty()) {
            return null;
        }

        return paginas.get(paginas.size() - 1);
    }

    public int cantidadDePaginas() {
        return paginas.size();
    }
}