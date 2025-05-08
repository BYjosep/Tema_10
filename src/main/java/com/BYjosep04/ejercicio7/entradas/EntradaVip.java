package com.BYjosep04.ejercicio7.entradas;

import com.BYjosep04.ejercicio7.Evento;
import com.BYjosep04.ejercicio7.interfaces.IAsiento;
import com.BYjosep04.ejercicio7.zonas.ZonaVip;

public class EntradaVip extends Entrada {
    private final int numeroSecreto;
    private final int filaCasillero;
    private final int columnaCasillero;

    /**
     * Constructor para crear una entrada VIP.
     * @param asiento El asiento asociado a la entrada.
     * @param evento El evento asociado a la entrada.
     * @param zonaVip La zona VIP que contiene la matriz de casilleros.
     * @param fila La fila del asiento en la zona VIP.
     * @param columna La columna del asiento en la zona VIP.
     * @throws IllegalArgumentException Si las coordenadas están fuera de rango.
     */
    public EntradaVip(IAsiento asiento, Evento evento, ZonaVip zonaVip, int fila, int columna) {
        super(asiento, evento);

        // Validar que las coordenadas estén dentro del rango de la matriz de casilleros
        if (fila < 0 || columna < 0 || fila >= zonaVip.getCasilleros().length || columna >= zonaVip.getCasilleros()[0].length) {
            throw new IllegalArgumentException("Las coordenadas del asiento están fuera de rango.");
        }

        // Asignar el número secreto del casillero correspondiente
        this.numeroSecreto = zonaVip.getCasilleros()[fila][columna].getCodigoSecreto();
        this.filaCasillero = fila;
        this.columnaCasillero = columna;
    }

    /**
     * Obtiene el número secreto del casillero asociado a la entrada VIP.
     * @return El número secreto del casillero.
     */
    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    /**
     * Obtiene la fila del casillero asociado a la entrada VIP.
     * @return La fila del casillero.
     */
    public int getFilaCasillero() {
        return filaCasillero;
    }

    /**
     * Obtiene la columna del casillero asociado a la entrada VIP.
     * @return La columna del casillero.
     */
    public int getColumnaCasillero() {
        return columnaCasillero;
    }

    /**
     * Representación en cadena de la entrada VIP.
     * @return Información sobre la entrada VIP.
     */
    @Override
    public String toString() {
        return "EntradaVip{" +
                "id=" + getId() +
                ", asiento=" + getAsiento() +
                ", evento=" + getEvento() +
                ", numeroSecreto=" + numeroSecreto +
                ", filaCasillero=" + filaCasillero +
                ", columnaCasillero=" + columnaCasillero +
                '}';
    }
}