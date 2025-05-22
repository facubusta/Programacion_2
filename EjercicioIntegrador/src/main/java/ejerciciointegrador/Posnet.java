package ejerciciointegrador;


public class Posnet {

    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double monto, int cuotas) {
        if (cuotas < 1 || cuotas > 6) {
            System.out.println("Cantidad de cuotas inválida.");
            return null;
        }

        double recargo = (cuotas > 1) ? (monto * 0.03 * (cuotas - 1)) : 0;
        double montoTotal = monto + recargo;
        double montoPorCuota = montoTotal / cuotas;
       
        if (!tarjeta.tieneSaldoDisponible(montoTotal)) {
            return null;
        }
        
        tarjeta.descontar(montoTotal);

        return new Ticket(tarjeta.getTitular(), montoTotal, montoPorCuota);
    }
}

       