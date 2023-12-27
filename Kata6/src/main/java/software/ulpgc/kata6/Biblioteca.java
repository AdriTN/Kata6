package software.ulpgc.kata6;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Libro> libros;

    public Biblioteca() {
        this.libros = new HashMap<>();
    }

    public boolean agregarLibro(Libro libro) {
        if(libros.containsKey(libro.getISBN())) {
            return false;
        }
        libros.put(libro.getISBN(), libro);
        return true;
    }

    public boolean prestarLibro(String isbn) {
        if(libros.containsKey(isbn)) {
            Libro libro = libros.get(isbn);
            if(!libro.isPrestado()) {
                libro.setPrestado(true);
                return true;
            }
        }
        return false;
    }

    public boolean verificarEstadoLibro(String isbn) {
        return libros.containsKey(isbn);
    }
}
