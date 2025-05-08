package com.BYjosep04.ejercicio7.entradas;

import com.BYjosep04.ejercicio7.Evento;
import com.BYjosep04.ejercicio7.interfaces.IAsiento;

public class EntradaNormal extends Entrada {
    private final int numeroSorteo;

    /**
     * Constructor para crear una entrada normal.
     * @param asiento El asiento asociado a la entrada.
     * @param evento El evento asociado a la entrada.
     * @param numeroSorteo El número de sorteo asociado a la entrada.
     * @throws IllegalArgumentException Si el número de sorteo no es válido.
     */
    public EntradaNormal(IAsiento asiento, Evento evento, int numeroSorteo) {
        super(asiento, evento);
        if (numeroSorteo <= 0) {
            throw new IllegalArgumentException("El número de sorteo debe ser mayor que 0.");
        }
        this.numeroSorteo = numeroSorteo;
    }

    /**
     * Obtiene el número de sorteo asociado a la entrada.
     * @return El número de sorteo.
     */
    public int getNumeroSorteo() {
        return numeroSorteo;
    }

    /**
     * Representación en cadena de la entrada normal.
     * @return Información sobre la entrada normal.
     */
    @Override
    public String toString() {
        return "EntradaNormal{" +
                "id=" + getId() +
                ", asiento=" + getAsiento() +
                ", evento=" + getEvento() +
                ", numeroSorteo=" + numeroSorteo +
                '}';
    }
}