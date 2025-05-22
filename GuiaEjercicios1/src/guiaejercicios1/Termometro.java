
package guiaejercicios1;

public class Termometro {
    private double temperatura;

    public Termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    //metodos

    // Celsius a Fahrenheit

    public double convertirCelsius(){
        return (temperatura - 32) * 5/9;
    }

    public double convertirFahrenheit(){
        return (temperatura * 9/5) + 32;
    }
    
    public void cambiarTemperatura(double variacion) {
        this.temperatura += variacion;
    }   

    @Override
    public String toString() {
        return "Termometro{" + "temperatura= " + temperatura + '}';
    }
    
    
}
