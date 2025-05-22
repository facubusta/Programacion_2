package guiaejercicios1;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    
    public Persona(String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
    
    public double calcularIMC(double peso){
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }
        return peso / (altura * altura);  
    }
    
}
