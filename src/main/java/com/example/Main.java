package com.example;

public class Main {

    public static void main(String[] args) {

        // PRUEBA CLASE CUENTABANCARIA
        System.out.println("=== CUENTA BANCARIA ===");

        CuentaBancaria cuenta1 = new CuentaBancaria("Daiana Roldan", 500000);

        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.printf("Saldo inicial: %.0f%n", cuenta1.getSaldo());

        cuenta1.depositar(20000);
        System.out.printf("Saldo después de depositar 20000: %.0f%n", cuenta1.getSaldo());

        cuenta1.retirar(10);
        System.out.printf("Saldo después de retirar 10: %.0f%n", cuenta1.getSaldo());

        cuenta1.retirar(10000); // prueba fondos insuficientes

        // PRUEBA CLASE ESTUDIANTE
        System.out.println("\n=== ESTUDIANTE ===");

        Estudiante est1 = new Estudiante("Lorena", 19, 3.9);
        est1.mostrarInfo();

        System.out.println();

        Estudiante est2 = new Estudiante("Luciana", 18, 4.5);
        est2.mostrarInfo();

        // PRUEBA CLASE LIBRO
        System.out.println("\n=== LIBRO ===");

        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        libro2.mostrarDetalles();

        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        libro3.mostrarDetalles();
    }
}