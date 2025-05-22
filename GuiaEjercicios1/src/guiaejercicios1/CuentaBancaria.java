package guiaejercicios1;


public class CuentaBancaria {
    private double saldo;
    private String titular;
    private int numDeCuenta;

    public CuentaBancaria(double saldo, String titular, int numDeCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numDeCuenta = numDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumDeCuenta() {
        return numDeCuenta;
    }

    public void setNumDeCuenta(int numDeCuenta) {
        this.numDeCuenta = numDeCuenta;
    }

    //metodos
    public void moverDinero(double cantidad, boolean operacion) {
        if (operacion) {
            saldo += cantidad;
            System.out.println("Se deposito: " + cantidad + " su nuevo saldo es: " + saldo);
        }else{
            if (cantidad > saldo) {
                System.out.println("No tienes suficiente saldo para retirar");
            }else{
                saldo -= cantidad;
                System.out.println("Se retiro: " + cantidad + " su nuevo saldo es: " + saldo);
            } 
        }
    }

    public double consultarSaldo(){
        return saldo;
    }
}
