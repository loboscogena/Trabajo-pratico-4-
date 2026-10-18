package edu.programacion.ejercicio2409;

public class Main {
    public static void main(String[] args) {

        Browser browser = new Browser();

        PaginaWeb pagina1 = new PaginaWeb(
                "https://www.google.com",
                "15/10/2026",
                120.5,
                "<html>Google</html>"
        );

        PaginaWeb pagina2 = new PaginaWeb(
                "https://www.wikipedia.org",
                "15/10/2026",
                250.0,
                "<html>Wikipedia</html>"
        );

        browser.navegar(pagina1);
        browser.navegar(pagina2);

        browser.agregarFavorito("https://www.google.com");

        System.out.println("Página actual: "
                + browser.paginaActual().direccion());

        System.out.println("Cantidad de páginas visitadas: "
                + browser.historial().cantidadDePaginas());

        System.out.println("Última página visitada: "
                + browser.historial().ultimaPagina().direccion());

        browser.historial().eliminarPaginas(pagina1);

        System.out.println("Cantidad después de eliminar: "
                + browser.historial().cantidadDePaginas());
    }
}