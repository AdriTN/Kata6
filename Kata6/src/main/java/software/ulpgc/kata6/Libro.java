package software.ulpgc.kata6;

public class Libro {
    private String ISBN;
    private boolean prestado;
    private String titulo;
    private String autor;

    public Libro(String ISBN, boolean prestado, String titulo, String autor) {
        this.ISBN = ISBN;
        this.prestado = prestado;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
