package com.BYjosep04.ejercicio7.zonas;

public class ZonaNormal extends Zona {
    private static final int MIN_ZONA = 1;

    public ZonaNormal(int numeroZona, double precioBase, int filas, int columnas) {
        super(numeroZona, precioBase, filas, columnas);
        if (!isZonaValida(numeroZona)) {
            throw new IllegalArgumentException("El numero de zona no es valido");
        }
    }

    private boolean isZonaValida(int numeroZona) {
        if(numeroZona >= MIN_ZONA ) {
            return true;
        }
        return false;
    }
}
