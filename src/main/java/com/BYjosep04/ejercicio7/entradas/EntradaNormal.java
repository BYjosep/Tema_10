package com.BYjosep04.ejercicio7.entradas;

import com.BYjosep04.ejercicio7.Evento;
import com.BYjosep04.ejercicio7.interfaces.IAsiento;

public class EntradaNormal extends Entrada {
    private final int numeroSorteo;

    public EntradaNormal(IAsiento asiento, Evento evento, int numeroSorteo) {
        super(asiento,evento);
        this.numeroSorteo = numeroSorteo;
    }
}
