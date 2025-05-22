
package com.mycompany.claseauto;


public class Auto {
    private final String patente;
    private String marca;
    private final  String color;
    private final  int modelo;

    public Auto(String patente, String marca, String color, int modelo) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

 
   
    public String toString() {
        return "Auto:{" + "patente=" + patente + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + '}';
    }

    
    
}
