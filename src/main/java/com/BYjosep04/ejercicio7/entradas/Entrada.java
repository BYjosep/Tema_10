package com.BYjosep04.ejercicio7.entradas;

import com.BYjosep04.ejercicio7.Evento;
import com.BYjosep04.ejercicio7.interfaces.IAsiento;

public abstract class Entrada {
    private static int count = 0;
    private final int id;
    private final IAsiento asiento;
    private final Evento evento;

    public Entrada(IAsiento asiento, Evento evento) {
        id = ++count;
        this.asiento = asiento;
        this.evento = evento;
    }

    public void venderEntrada(IAsiento asiento) throws IllegalStateException {
        if (asiento.isOcupado()) {
            throw new IllegalStateException("No se ha podido vender entrada, el asiento ya está ocupado.");
        }

        asiento.ocuparAsiento();
    }
}
