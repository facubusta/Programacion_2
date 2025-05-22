
package com.mycompany.ejerciciohotel;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String dni;
    private ArrayList<String> notificaciones;
    
    public Persona(){
        this.notificaciones = new ArrayList<>();
    }

    public Persona(String nombre, String dni, ArrayList<String> notificaciones) {
        this();
        this.nombre = nombre;
        this.dni = dni;
    }
   
    
    
}
