import java.sql.SQLOutput;
import java.util.Scanner;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = año;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    //Método main para probar
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);
        miCoche.mostrarInfo();
    }
}
