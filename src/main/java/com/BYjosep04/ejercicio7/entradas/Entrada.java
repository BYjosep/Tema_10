package com.BYjosep04.ejercicio7.entradas;

import com.BYjosep04.ejercicio7.Evento;
import com.BYjosep04.ejercicio7.interfaces.IAsiento;

public abstract class Entrada {
    private static int count = 0; // Contador para generar IDs únicos
    private final int id;
    private final IAsiento asiento;
    private final Evento evento;

    /**
     * Constructor para crear una entrada.
     * @param asiento El asiento asociado a la entrada.
     * @param evento El evento asociado a la entrada.
     * @throws IllegalArgumentException Si el asiento o el evento son nulos.
     */
    public Entrada(IAsiento asiento, Evento evento) {
        if (asiento == null || evento == null) {
            throw new IllegalArgumentException("El asiento y el evento no pueden ser nulos.");
        }
        id = ++count;
        this.asiento = asiento;
        this.evento = evento;
    }

    /**
     * Obtiene el ID único de la entrada.
     * @return El ID de la entrada.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el asiento asociado a la entrada.
     * @return El asiento asociado.
     */
    public IAsiento getAsiento() {
        return asiento;
    }

    /**
     * Obtiene el evento asociado a la entrada.
     * @return El evento asociado.
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * Intenta vender la entrada ocupando el asiento asociado.
     * @param asiento El asiento que se intenta ocupar.
     * @throws IllegalStateException Si el asiento ya está ocupado.
     */
    public void venderEntrada(IAsiento asiento) throws IllegalStateException {
        if (asiento.isOcupado()) {
            throw new IllegalStateException("No se ha podido vender entrada, el asiento ya está ocupado.");
        }
        asiento.ocuparAsiento();
    }

    /**
     * Representación en cadena de la entrada.
     * @return Información sobre la entrada.
     */
    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", asiento=" + asiento +
                ", evento=" + evento +
                '}';
    }
}