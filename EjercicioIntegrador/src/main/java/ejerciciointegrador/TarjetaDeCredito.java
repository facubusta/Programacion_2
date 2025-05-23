package ejerciciointegrador;


public class TarjetaDeCredito {
    private EntidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private String numero;
    private double saldo;
    private Persona titular;

    public TarjetaDeCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria,
        String numero, double saldoDisponible, Persona titular) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldoDisponible;
        this.titular = titular;
    }
    
    public boolean puedoPagar(double monto) {
        return saldo >= monto;
        
    }
    
    public void debitar(double monto) {
        if (puedoPagar(monto)) {
            saldo -= monto;
        } 
    }
    
    public String nombreCompletoTitular(){
        return titular.getNombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadFinanciera=" + entidadFinanciera + ", entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + '}';
    }
    
    
  
}

   
   
   
    
    

