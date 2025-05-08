package com.BYjosep04.ejercicio7.zonas;

public class ZonaVip extends Zona {

 Casillero[][] casillero;
    /**
     * Constructor para crear una Zona VIP.
     * @param precioBase Precio base de la zona VIP.
     * @param filas Número de filas en la zona VIP.
     * @param columnas Número de columnas en la zona VIP.
     * Nota: El número de zona se fija como 0 porque solo habrá una única zona VIP,
     * y esta será la primera zona del sistema.
     */
    public ZonaVip( double precioBase, int filas, int columnas, Casillero casillero ) {
        super(0, precioBase, filas, columnas);
        this.casillero =new Casillero[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.casillero[i][j] = new Casillero();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ZonaVIP - Casilleros:\n");
        for (int i = 0; i < casillero.length; i++) {
            for (int j = 0; j < casillero[i].length; j++) {
                sb.append("Fila ").append(i).append(", Columna ").append(j).append(": ")
                        .append(casillero[i][j]).append("\n");
            }
        }
        return sb.toString();
    }

    public Casillero[][] getCasilleros() {
        return casillero;
    }
}
