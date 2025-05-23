package ejerciciointegrador;

public class Main {
    public static void main(String[] args) {
        // 1. Crear persona
        Persona titular = new Persona("12345678", "Juan", "Pérez", "1122334455", "juan.perez@mail.com");

        // 2. Crear tarjeta
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(
            EntidadFinanciera.VISA,
            "Banco Nación",
            "1234-5678-9876-5432",
            30000,
            titular
        );

        // 3. Crear POSNET
        Posnet posnet = new Posnet();

        // 4. Procesar pago de $20000 en 5 cuotas
        Ticket ticket = posnet.efectuarPago(tarjeta, 20000, 5);

        // 5. Mostrar ticket si fue exitoso
        if (ticket != null) {
            System.out.println("¡Pago exitoso!");
            System.out.println("Titular: ");
            System.out.println("Monto total: $");
            System.out.println("Monto por cuota: $");
        } else {
            System.out.println("Pago rechazado.");
        }
    }
}
