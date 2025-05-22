package com.mycompany.ejerciciointegradorlistas;

import java.util.*;

public class Empresa {
    private List<Sucursal> sucursales;

    public Empresa() {
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal s) {
        sucursales.add(s);
    }

    public Sucursal getSucursal(String nombre) {
        for (Sucursal s : sucursales) {
            if (s.getNombre().equalsIgnoreCase(nombre)) {
                return s;
            }
        }
        return null;
    }
}
