package guiaejercicios1;

public class Rectangulo {
    private double ancho;
    private double alto;


    public Rectangulo(double ancho, double alto){
    this.ancho = ancho;
    this.alto = alto;
    }
     
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double calcularArea(){
        return ancho * alto;
    }
    
    public double calcularPerimetro(){
        return (ancho + alto) * 2;
    }
    
    public boolean calcularCuadrado(){
        return ancho == alto;
    }
}
    