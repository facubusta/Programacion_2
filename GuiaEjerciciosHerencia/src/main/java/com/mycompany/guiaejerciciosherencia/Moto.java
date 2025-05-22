package com.mycompany.guiaejerciciosherencia;


public class Moto extends Vehiculo {
    private boolean esElectrica;

    public Moto(String marca, String modelo, boolean esElectrica) {
        super(marca, modelo);
        this.esElectrica = esElectrica;
    }

    @Override
    public String toString() {
        return "Moto [Marca: " + getMarca() + ", Modelo: " + getModelo() +
            ", Es electrica: " + (esElectrica ? "Si" : "No") + "]";
    }
}