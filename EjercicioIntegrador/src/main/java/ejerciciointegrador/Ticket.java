package ejerciciointegrador;


public class Ticket {
    private Persona titular;
    private double montoTotal;
    private double montoPorCuota;

    public Ticket(Persona titular, double montoTotal, double montoPorCuota) {
        this.titular = titular;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    public Persona getTitular() {
        return titular;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    @Override
    public String toString() {
        return "TICKET DE PAGO\n" +
               "Titular: " + titular.getNombreCompleto() + "\n" +
               "Monto total: $" + montoTotal + "\n" +
               "Monto por cuota: $" + montoPorCuota;
    }
}

