package tests;

import org.junit.Test;
import software.ulpgc.kata6.Biblioteca;
import software.ulpgc.kata6.Libro;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class BibliotecaTest {

    @Test
    public void agregarlibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("12345", false, "Don Quijote", "Miguel de Cervantes");
        assertTrue(biblioteca.agregarLibro(libro));
    }

    @Test
    public void prestarLibroDisponible() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("12345", false, "Don Quijote", "Miguel de Cervantes");
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.prestarLibro("12345"));
    }

    @Test
    public void prestarLibroNoDisponible() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("12345", false, "Don Quijote", "Miguel de Cervantes");
        biblioteca.agregarLibro(libro);
        biblioteca.prestarLibro("12345");
        assertFalse(biblioteca.prestarLibro("12345"));
    }

    @Test
    public void libroNoExiste() {
        Biblioteca biblioteca = new Biblioteca();
        assertFalse(biblioteca.verificarEstadoLibro("12345"));
    }
}
