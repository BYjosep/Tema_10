package com.BYjosep04.ejercicio7.zonas;

import com.BYjosep04.ejercicio7.interfaces.IAsiento;

public abstract class Zona {
    private final int numeroZona;
    private double precioBase;
    private IAsiento[][] asientos;

    public Zona(int numeroZona, double precioBase, int filas, int columnas) {
        this.numeroZona = numeroZona;
        this.precioBase = precioBase;
        this.asientos = new IAsiento[filas][columnas];
    }
}
