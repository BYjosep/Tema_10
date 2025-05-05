package com.BYjosep04.ejercicio4;

public enum Colores {
    BLANCO("Blanco"), NEGRO("Negro"),
    ROJO("Rojo"), AZUL("Azul") , GRIS("Gris");

    private final String nombre;

    Colores(String nombre){
    this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Color{" +
                "nombre='" + nombre +
                '}';
    }
}
