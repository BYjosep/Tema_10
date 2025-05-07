package com.BYjosep04.ejercicio6;

public enum TipoMultimedia {
    CD("CD"), DVD("DVD"), BLU_RAY("Blu-ray"), ARCHIVO("Archivo"), CARTUCHO("Cartucho");

    private final String texto;

    TipoMultimedia(String texto) {
        this.texto = texto;
    }
}
