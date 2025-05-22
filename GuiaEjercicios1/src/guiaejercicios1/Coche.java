
package guiaejercicios1;


public class Coche {

    private String marca;
    private int modelo;
    private double kilometraje;
    private double combustibleRestante;
    private double consumoPorKilometro;

    public Coche(String marca, int modelo, double kilometraje, double combustibleRestante, double consumoPorKilometro) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.combustibleRestante = combustibleRestante;
        this.consumoPorKilometro = consumoPorKilometro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getCombustibleRestante() {
        return combustibleRestante;
    }

    public void setCombustibleRestante(double combustibleRestante) {
        this.combustibleRestante = combustibleRestante;
    }

    public double calcularAutonomia() {
        return combustibleRestante / consumoPorKilometro;
    }

    public void cargarCombustible(double Carga) {
        if (Carga > 0) {
            combustibleRestante += Carga;
            System.out.println("Se agregaron:" + Carga + "litros. Ahora hay " + combustibleRestante);
        } else {
            System.out.println("La cantidad de carga debe ser mayor a 0");
        }
    }
}
