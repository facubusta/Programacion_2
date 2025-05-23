package com.mycompany.interfaces;

public class Avion implements Volador {
    private String matricula;
    private String marca;
    private int pasajeros;

    public Avion(String matricula, String marca, int pasajeros) {
        this.matricula = matricula;
        this.marca = marca;
        this.pasajeros = pasajeros;
    }
    
    public void subirTrenAterizaje(){
        System.out.println("Subiendo Aterrizaje");
       
    }
    public void bajarTrenAterrizaje(){
        System.out.println("bajando tren de Aterrizaje");
    }
    
    
    
    public void despegar(){
        System.out.println("Despegando");
        subirTrenAterizaje();
    }
    
    public void volar(){
        System.out.println("volando");
    }
    
    
    public void aterrizar(){
        System.out.println("Aterrizando");
        bajarTrenAterrizaje();
    }
    
}
