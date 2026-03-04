package com.example;

public class Libro {

    // Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor vacío
    public Libro() {
        this("Desconocido", "Anónimo", 0);
    }

    // Constructor con título y autor
    public Libro(String titulo, String autor) {
        this(titulo, autor, 0);
    }

    // Constructor completo
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println(
            "Libro: " + this.titulo +
            " | Autor: " + this.autor +
            " | Páginas: " + this.paginas
        );
    }
}