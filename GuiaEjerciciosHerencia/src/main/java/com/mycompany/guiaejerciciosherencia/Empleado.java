package com.mycompany.guiaejerciciosherencia;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado:" + obtenerNombre() + "nombre=" + nombre + ", salario=" + salario + '}';
    }

   
}