package com.mycompany.guiaejerciciosherencia;


public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double obtenerLado() {
        return lado;
    }

    public void establecerLado(double lado) {
        this.lado = lado;
    }
}

   