package com.mycompany.ejerciciointegradorlistas;

public class Dispositivo {
    private String id;
    private double precio;
    private String tipo; // "Teléfonos", "Computadoras", "Tablets"

    public Dispositivo(String id, double precio, String tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Precio: $" + precio + ", Tipo: " + tipo;
    }
}
