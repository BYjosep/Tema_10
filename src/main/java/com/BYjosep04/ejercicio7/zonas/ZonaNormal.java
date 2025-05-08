package com.BYjosep04.ejercicio7.zonas;

public class ZonaNormal extends Zona {
    private static final int MIN_ZONA = 1; // Número mínimo permitido para una zona normal

    /**
     * Constructor para crear una Zona Normal.
     * @param numeroZona Número de la zona normal (debe ser >= 1).
     * @param precioBase Precio base de la zona normal.
     * @param filas Número de filas en la zona normal.
     * @param columnas Número de columnas en la zona normal.
     * @throws IllegalArgumentException Si el número de zona no es válido.
     */
    public ZonaNormal(int numeroZona, double precioBase, int filas, int columnas) {
        super(numeroZona, precioBase, filas, columnas);
        if (!isZonaValida(numeroZona)) {
            throw new IllegalArgumentException("El número de zona (" + numeroZona + ") debe ser mayor o igual a " + MIN_ZONA);
        }
    }


    /**
     * Verifica si un número de zona es válido.
     * @param numeroZona Número de zona a validar.
     * @return true si el número de zona es válido, false en caso contrario.
     */
    private boolean isZonaValida(int numeroZona) {
        return numeroZona >= MIN_ZONA;
    }

    /**
     * Representación en cadena de la zona normal.
     * @return Información sobre la zona normal.
     */
    @Override
    public String toString() {
        return "ZonaNormal{" +
                "numeroZona=" + getNumeroZona() +
                ", precioBase=" + getPrecioBase() +
                ", filas=" + getFilas() +
                ", columnas=" + getColumn() +
                '}';
    }
}