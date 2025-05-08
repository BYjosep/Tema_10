package com.BYjosep04.ejercicio7.zonas;

import com.BYjosep04.ejercicio7.interfaces.IAsiento;
import lib.ANSI; // Importamos la librería ANSI

public class Asiento implements IAsiento {
    private boolean ocupado;

    /**
     * Constructor para crear un asiento inicialmente libre.
     */
    public Asiento() {
        this.ocupado = false;
    }

    /**
     * Verifica si el asiento está ocupado.
     * @return true si el asiento está ocupado, false si está libre.
     */
    @Override
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * Ocupa el asiento si está libre.
     * @throws IllegalStateException Si el asiento ya está ocupado.
     */
    @Override
    public void ocuparAsiento() {
        if (ocupado) {
            throw new IllegalStateException("El asiento ya está ocupado.");
        }
        ocupado = true;
    }

    /**
     * Libera el asiento si está ocupado.
     * @throws IllegalStateException Si el asiento ya está libre.
     */
    @Override
    public void liberarAsiento() {
        if (!ocupado) {
            throw new IllegalStateException("El asiento ya está libre.");
        }
        ocupado = false;
    }

    /**
     * Representación en cadena del asiento con colores ANSI.
     * @return [X] en rojo si el asiento está ocupado, [ ] en verde si está libre.
     */
    @Override
    public String toString() {
        if (ocupado) {
            return ANSI.format("[X]", true, ANSI.Color.RED, ANSI.Color.NONE); // Asiento ocupado en rojo
        } else {
            return ANSI.format("[ ]", true, ANSI.Color.GREEN, ANSI.Color.NONE); // Asiento libre en verde
        }
    }
}