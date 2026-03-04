package com.example;

public class CuentaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor corregido
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = (saldoInicial < 0) ? 0 : saldoInicial;
    }

    // Getter del titular
    public String getTitular() {
        return this.titular;
    }

    // Setter del titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter del saldo (sin setter)
    public double getSaldo() {
        return this.saldo;
    }

    // Método para depositar
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que 0.0");
            return;
        }
        this.saldo += cantidad;
    }

    // Método para retirar
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que 0.0");
            return;
        }

        if (cantidad > this.saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else {
            this.saldo -= cantidad;
        }
    }
}

