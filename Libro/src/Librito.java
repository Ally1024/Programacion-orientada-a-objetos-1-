import java.sql.SQLOutput;
import java.util.Scanner;

public class Librito {
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor
    public Librito(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Método para devolver descripción
    public String descripcion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numPaginas;
    }

    // Método main para probar
    public static void main(String[] args) {
        Librito libro1 = new Librito("Cien Años de Soledad", "Gabriel García Márquez", 417);
        System.out.println(libro1.descripcion());
    }
}

