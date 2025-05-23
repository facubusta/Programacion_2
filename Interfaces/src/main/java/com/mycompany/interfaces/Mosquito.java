package com.mycompany.interfaces;

public class Mosquito implements Volador {
    private String especie;
    private int dias ;
    private char genero;

    public Mosquito(String especie, int dias, char genero) {
        this.especie = especie;
        this.dias = dias;
        this.genero = genero;
    }
    
    public void picar (){
        System.out.println("Cuidado  que te pico");
    }
    
    public void despegar(){
        System.out.println("Despegando");
    }
    
    public void volar(){
        System.out.println("volando");
    }
    
    public void aterrizar(){
        System.out.println("Aterrizando");
    }
}
    
    