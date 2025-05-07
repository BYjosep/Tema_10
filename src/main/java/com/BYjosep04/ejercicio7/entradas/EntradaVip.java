package com.BYjosep04.ejercicio7.entradas;

import com.BYjosep04.ejercicio7.Evento;
import com.BYjosep04.ejercicio7.interfaces.IAsiento;

public class EntradaVip extends Entrada {

    private final int numeroSecreto;

    public EntradaVip(IAsiento asiento, Evento evento, int numeroSecreto) {
        super(asiento,evento);
        this.numeroSecreto = numeroSecreto;
    }
}
