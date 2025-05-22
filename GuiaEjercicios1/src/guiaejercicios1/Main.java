
package guiaejercicios1;


public class Main {

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(5.0, 10.0); 
        Rectangulo r2 = new Rectangulo(8.0, 8.0); 
    
        System.out.println("RECTANGULOS(1)");
        System.out.println("El area de r1 es: " + r1.calcularArea());
        System.out.println("El perimetro de r1 es: " + r1.calcularPerimetro());
        System.out.println("r1 es cuadrado?: " + r1.calcularCuadrado());
        System.out.println("El area de r2 es: " + r2.calcularArea());
        System.out.println("El perimetro de r2 es: " + r2.calcularPerimetro());
        System.out.println("r2 es cuadrado?: " + r2.calcularCuadrado());
        System.out.println("#################################");
        
        Circulo c1 = new Circulo(10.0);
        Circulo c2 = new Circulo(8.0);
      
        System.out.println("CIRCULOS(2)");
        System.out.println("El area de c1 es de: " + c1.calcularArea());
        System.out.println("El perimetro de c1 es de: " + c1.calcularPerimetro());
        System.out.println("El radio al escalar un 150% es de: " + c1.calcularEscalar(50));
        System.out.println("El area de c2 es de: " + c2.calcularArea());
        System.out.println("El perimetro de c2 es de: " + c2.calcularPerimetro());
        System.out.println("El radio al escalar un -90% es de: " + c2.calcularEscalar(-90));
        
        Persona p1 = new Persona("facu", 33, 1.80);
        
        System.out.println("Es mayor? :" + p1.esMayorDeEdad());
        System.out.println("El imc corporal es de :" + p1.calcularIMC(72));
        
        Coche auto1 = new Coche ("chevrolet", 2029, 5000, 50.4, 10.7);

        System.out.println(auto1.calcularAutonomia());
        auto1.cargarCombustible(40.8);
        
        CuentaBancaria cuenta01 = new CuentaBancaria(667, "Max", 224637111);

        cuenta01.moverDinero(143, true);
        cuenta01.moverDinero(227, false);

        System.out.println("Su saldo actual es: " + cuenta01.consultarSaldo());
        
        Libro libro01 = new Libro("El principito", "Jorge", 14 );

        System.out.println(libro01.moverPagina(14));
        System.out.println("Termino el libro: " + libro01.terminarLibro());
        
        Termometro t1 = new Termometro(17);
        Termometro t2 = new Termometro(89);

        System.out.println(t1.toString());
        System.out.println(t1.convertirFahrenheit());

        System.out.println(t2.toString());
        System.out.println(t2.convertirCelsius());
        
        t1.cambiarTemperatura(5.5); 
        System.out.println(t1.toString());
        
        t1.cambiarTemperatura(-2.5); 
        System.out.println(t1.toString());  
        
        Producto pr1 = new Producto("alfajor", 120, 50);
        System.out.println(pr1.aplicarDescuento(25));
        pr1.realizarVenta(45);
        
        Pelota pe1 = new Pelota("Nike", 10);
        Pelota pe2 = new Pelota("Adidas", 10);
        
        System.out.println(pe1.compararPelota(pe2));
        pe1.inflarPelota(20);
        pe1.inflarPelota(-5);
        
        Reloj re1 = new Reloj(23, 59, 58);

        re1.mostrarHora(); 
        re1.avanzarUnSegundo();
        re1.mostrarHora(); 
        re1.avanzarUnSegundo();
        re1.mostrarHora(); 
    }
        
    }


