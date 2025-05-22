
package guiaejercicios1;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void ajustarHora(int nuevaHora){
        this.horas = nuevaHora;
    }
    
    public void ajustarMinutos(int nuevoMinuto){
        this.minutos = nuevoMinuto;
    }
    
    public void ajustarSegundos(int nuevoSegundo){
        this.segundos = nuevoSegundo;
    }
    public void avanzarUnSegundo() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                horas++;
                if (horas >= 24) {
                    horas = 0;
                }
            }
        }
    }
    public void mostrarHora() {
        System.out.printf("Hora actual: %02d:%02d:%02d\n", horas, minutos, segundos);
    }
}