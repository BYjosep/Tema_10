package com.BYjosep04.ejercicio7;

import java.time.LocalDate;

public class Evento {
    private final String nombre;
    private final LocalDate fecha;
    private final String descripcion;

    public Evento(String nombre, LocalDate fecha, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Evento(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = "Sin descripcion";
    }

}
