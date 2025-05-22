package com.mycompany.guiaejerciciosherencia;

public class Gerente extends Empleado {
    private int cantidadEmpleadosACargo;

    public Gerente(String nombre, double salario, int cantidadEmpleadosACargo) {
        super(nombre, salario);
        this.cantidadEmpleadosACargo = cantidadEmpleadosACargo;
    }

    public int obtenerCantidadEmpleadosACargo() {
        return cantidadEmpleadosACargo;
    }

    @Override
    public String toString() {
        return "Gerente: " + obtenerNombre() + "\nCantidad de empleados a cargo = " + cantidadEmpleadosACargo;
    }

    
    
}