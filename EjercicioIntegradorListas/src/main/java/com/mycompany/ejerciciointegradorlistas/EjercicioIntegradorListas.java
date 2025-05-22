package com.mycompany.ejerciciointegradorlistas;

public class EjercicioIntegradorListas {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Sucursal s1 = new Sucursal("Sucursal Centro");
        s1.agregarDispositivo(new Dispositivo("A1", 50000, "Teléfonos"));
        s1.agregarDispositivo(new Dispositivo("B2", 150000, "Computadoras"));
        s1.agregarDispositivo(new Dispositivo("C3", 30000, "Tablets"));
        s1.agregarDispositivo(new Dispositivo("D4", 55000, "Teléfonos"));

        empresa.agregarSucursal(s1);

        System.out.println("=== Todos los dispositivos ===");
        s1.listarDispositivos();

        System.out.println("\n=== Solo teléfonos ===");
        for (Dispositivo d : s1.dispositivosPorTipo("Teléfonos")) {
            System.out.println(d);
        }

        System.out.println("\n=== Borrar dispositivo con ID 'A1' ===");
        s1.borrarDispositivo("A1");
        s1.listarDispositivos();

        System.out.println("\n=== Porcentaje por tipo ===");
        Map<String, Double> porcentajes = s1.porcDispositivosPorTipo();
        for (String tipo : porcentajes.keySet()) {
            System.out.printf("%s: %.2f%%\n", tipo, porcentajes.get(tipo));
        }
    }
}