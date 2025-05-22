package com.mycompany.guiaejerciciosherencia;


public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método a sobreescribir
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
    