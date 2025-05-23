package ejerciciointegrador;


public class Posnet {
    private static final int MIN_CUOTA = 1; 
    private static final int MAX_CUOTA = 6;
    private static final double PORC_REC_CUOTA = 0.03;
            
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double monto, int cuotas) {
        try{
        validarDatos(tarjeta, monto, cuotas);
        double total = calcularMontoTotal(monto, cuotas);
        if (tarjeta.puedoPagar(total)){
             tarjeta.debitar(total);
             return new Ticket(tarjeta.nombreCompletoTitular() , total, total / cuotas);
            }
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    private double calcularMontoTotal (double  monto, int cuotas){
        return monto * (1 + calcularRecargo(monto, cuotas));
    } 
    
    private double calcularRecargo(double monto, int cuotas){
        return (cuotas - 1) * PORC_REC_CUOTA;
        
    }
    
    private boolean validarDatos(TarjetaDeCredito tarjeta, double monto, int cuotas  ){
        return validarCuotas(cuotas)
               && validarMonto(monto)
               && validarTarjeta(tarjeta);
    }
            
    public static boolean validarCuotas(int cuotas){
        if (cuotas < MIN_CUOTA || cuotas > MAX_CUOTA) {
            throw new IllegalArgumentException("Cuotas invalidas");
        }
        return true; 
    }
    
    private boolean chekSaldo(TarjetaDeCredito tarjeta, double monto){
        return tarjeta.puedoPagar(monto) ;
    }
    
    private static boolean validarTarjeta(TarjetaDeCredito tarjeta){
        return tarjeta != null;
    }
    
    private  static  boolean validarMonto(double monto){
        return monto > 0;
    }
}

       