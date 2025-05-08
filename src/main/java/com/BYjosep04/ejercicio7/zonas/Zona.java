package com.BYjosep04.ejercicio7.zonas;
import lib.ANSI;
import com.BYjosep04.ejercicio7.interfaces.IAsiento;

public abstract class Zona {
    private final int numeroZona;
    private double precioBase;
    private IAsiento[][] asientos;
    private final int filas;
    private final int column;

    public Zona(int numeroZona, double precioBase, int filas, int column) {
        this.numeroZona = numeroZona;
        this.precioBase = precioBase;
        this.filas = filas;
        this.column = column;
        this.asientos = new Asiento[filas][column];
        inicializarAsientos(filas, column);
    }

    private void inicializarAsientos(int filas, int column) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < column; j++) {
                asientos[i][j] = new Asiento(); // O cualquier otra implementación de IAsiento
            }
        }
    }

    public boolean isAsientoOcupado(int fila, int column) {
        if(fila <0 || column<0||fila>this.filas || column>this.column) {
            throw new IndexOutOfBoundsException("El asiento no es válido");
        }
        if (asientos[fila][column] == null) {
            throw new NullPointerException("El asiento no se ha creado");
        }
        return asientos[fila][column].isOcupado();
    }

    public boolean ocuparAsiento(int fila, int column) {
        if (isAsientoOcupado(fila, column)) {
            return false;
        }
        asientos[fila][column].ocuparAsiento();
        return true;
    }

    public boolean liberarAsiento(int fila, int column) {
        if (!isAsientoOcupado(fila, column)) {
            return false;
        }
        asientos[fila][column].liberarAsiento();
        return true;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Encabezado con información de la zona
        sb.append(ANSI.format("Zona %d - Dimensiones: %d filas x %d columnas\n", true, ANSI.Color.CYAN, ANSI.Color.NONE, numeroZona, filas, column));

        // Representación de la matriz de asientos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < column; j++) {
                if (asientos[i][j].isOcupado()) {
                    // Asiento ocupado: mostrado en rojo
                    sb.append(ANSI.format("[X]", true, ANSI.Color.RED, ANSI.Color.NONE));
                } else {
                    // Asiento libre: mostrado en verde
                    sb.append(ANSI.format("[ ]", true, ANSI.Color.GREEN, ANSI.Color.NONE));
                }
            }
            sb.append("\n"); // Nueva línea al final de cada fila
        }

        return sb.toString();
    }

}
