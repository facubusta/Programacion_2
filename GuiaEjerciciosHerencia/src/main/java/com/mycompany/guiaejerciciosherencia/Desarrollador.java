package com.mycompany.guiaejerciciosherencia;

public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador(String nombre, double salario, String lenguajePrincipal) {
        super(nombre, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String obtenerLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void establecerLenguajePrincipal(String lenguaje) {
        this.lenguajePrincipal = lenguaje;
    }

    @Override
    public String toString() {
        return "Desarrollador: " + obtenerNombre() + "\nLenguaje principal = " + lenguajePrincipal;
    }
    
    
}