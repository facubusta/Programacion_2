package com.mycompany.guiaejerciciosherencia;

public class GuiaEjerciciosHerencia {

    public static void main(String[] args) {
       
        System.out.println("------------------1---------------");
        
        Perro miPerro = new Perro("Cayena", 3);
        Gato miGato = new Gato("Pimienta", 2);

        miPerro.hacerSonido(); 
        miGato.hacerSonido(); 

        System.out.println("------------------2---------------");
        
        Coche miCoche = new Coche("Fiat", "Siena", 4);
        Moto miMoto = new Moto("Honda", "2017", false);

        System.out.println(miCoche); 
        System.out.println(miMoto);
        
        System.out.println("------------------3---------------");
        
        Figura cuadrado = new Cuadrado(4.0);
        Figura circulo = new Circulo(3.0);

        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Area del circulo: " + circulo.calcularArea());
        
        System.out.println("------------------4---------------");
        
        Gerente gerente = new Gerente("Laura", 75000, 5);
        Desarrollador desarrollador = new Desarrollador("Carlos", 50000, "Java");

        System.out.println(gerente);

        System.out.println(desarrollador);
        
    }
}