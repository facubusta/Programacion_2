package ejerciciointegrador;


public class Main {
    public static void main(String[] args) {
        Persona titular = new Persona(
            "12345678", 
            "Juan", 
            "Perez", 
            "1122334455", 
            "juan.perez@email.com");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(
            "Visa",
            "Banco Nación",
            "4500-1234-5678-9010",
            30000,
            titular);

        Posnet posnet = new Posnet();
        Ticket ticket = posnet.efectuarPago(tarjeta, 20000, 5);

        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("No se pudo realizar el pago. Saldo insuficiente.");
        }
    }
}