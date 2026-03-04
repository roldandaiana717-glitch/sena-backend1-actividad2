package com.example;

public class Estudiante {

    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
        this("", 0, 0);
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad); // mantiene validación
        this.promedio = promedio;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getPromedio() {
        return this.promedio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            System.out.println("Error: La edad debe ser mayor que 0");
            return;
        }
        this.edad = edad;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método booleano
    public boolean haAprobado() {
        return this.promedio >= 3.0;
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Promedio: " + this.promedio);
        System.out.println("Estado: " + (haAprobado() ? "Aprobó" : "No aprobó"));
    }
}