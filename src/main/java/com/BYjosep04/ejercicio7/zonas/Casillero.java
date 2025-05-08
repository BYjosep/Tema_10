package com.BYjosep04.ejercicio7.zonas;

public class Casillero {
    private int count = 0;
    private final int id;
    private final int codigoSecreto;

    public Casillero() {
        this.id = count++;
        this.codigoSecreto = lib.LibRandoms.ran(0,9999);
    }

    public int getCodigoSecreto() {
        return codigoSecreto;
    }
    public int getId() {
        return id;
    }

    public boolean isAbierto(int codigoSecreto) {
        return this.codigoSecreto == codigoSecreto;
    }

    @Override
    public String toString() {
        return "Casillero{" +
                "id=" + id +
                '}';
    }
}
