package guiaejercicios1;

public class Circulo {
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
    
     public double calcularEscalar(double porcentaje) {
        radio = radio * (1 + porcentaje / 100);
        return radio;
    }
    
}
