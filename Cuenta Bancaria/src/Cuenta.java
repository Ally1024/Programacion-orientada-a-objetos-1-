import java.sql.SQLOutput;
import java.util.Scanner;

public class Cuenta {
    private String titular;
    private double saldo;

    // Constructor
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    // Método main para probar
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Ana", 500);
        cuenta.depositar(200);
        cuenta.retirar(100);
        cuenta.retirar(700);
    }
}
