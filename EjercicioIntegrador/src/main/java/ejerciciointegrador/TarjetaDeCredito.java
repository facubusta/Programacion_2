package ejerciciointegrador;


public class TarjetaDeCredito {
    private String entidadFinanciera;
    private String entidadBancaria;
    private String numero;
    private double saldoDisponible;
    private Persona titular;

    public TarjetaDeCredito(String entidadFinanciera, String entidadBancaria,
            String numero, double saldoDisponible, Persona titular) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
    }
    
    public boolean tieneSaldoDisponible(double monto) {
        return saldoDisponible >= monto;
    }
    
    public void descontar(double monto) {
        if (tieneSaldoDisponible(monto)) {
            saldoDisponible -= monto;
        }
    }
    
    public Persona getTitular() {
        return titular;
    }
   
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadFinanciera=" + entidadFinanciera + ", entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldoDisponible=" + saldoDisponible + ", titular=" + titular + '}';
    }
    
    
    
}
