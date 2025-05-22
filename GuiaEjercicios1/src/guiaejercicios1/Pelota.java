
package guiaejercicios1;


public class Pelota {
    private String marca;
    private double circunferencia;

    public Pelota(String marca, double circunferencia) {
        this.marca = marca;
        this.circunferencia = circunferencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }
    
    public boolean compararPelota(Pelota pelota2){
        return this.circunferencia == pelota2.circunferencia;
    }
    
    public void inflarPelota(double aumento){
        if(aumento > 0){
            circunferencia += aumento;
            System.out.println("Se inflo la pelota en " + aumento + " y su nueva circunferencia es de : " + circunferencia);
        }
        else{
            System.out.println("El valor debe ser positivo");
        }
    }
}
         
    

