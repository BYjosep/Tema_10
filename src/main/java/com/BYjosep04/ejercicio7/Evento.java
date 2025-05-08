package com.BYjosep04.ejercicio7;

import java.time.LocalDate;

public class Evento {
    private int count =0;
    private final int id;
    private final String nombre;
    private final LocalDate fecha;
    private final String descripcion;

    /**
     * Constructor para crear un evento con nombre, fecha y descripción.
     * @param nombre El nombre del evento.
     * @param fecha La fecha del evento.
     * @param descripcion La descripción del evento.
     * @throws IllegalArgumentException Si el nombre es nulo o vacío, o si la fecha es nula.
     */
    public Evento(String nombre, LocalDate fecha, String descripcion) {
        this.id = ++count;
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del evento no puede ser nulo o vacío.");
        }
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha del evento no puede ser nula.");
        }
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion != null ? descripcion : "Sin descripcion";
    }

    /**
     * Constructor para crear un evento con nombre y fecha, pero sin descripción.
     * @param nombre El nombre del evento.
     * @param fecha La fecha del evento.
     * @throws IllegalArgumentException Si el nombre es nulo o vacío, o si la fecha es nula.
     */
    public Evento(String nombre, LocalDate fecha) {
        this(nombre, fecha, "Sin descripcion");
    }


    public int getId() {
        return id;
    }
    /**
     * Obtiene el nombre del evento.
     * @return El nombre del evento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la fecha del evento.
     * @return La fecha del evento.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Obtiene la descripción del evento.
     * @return La descripción del evento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Representación en cadena del evento.
     * @return Información sobre el evento.
     */
    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}