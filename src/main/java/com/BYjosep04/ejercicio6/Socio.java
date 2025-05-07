package com.BYjosep04.ejercicio6;

import lib.LibDate;

import java.time.LocalDate;
import java.util.Objects;

public class Socio {
    private final String nif;
    private final LocalDate fechaNacimiento;
    private String nombre;
    private String Poblacion;


    public Socio(String nif, String nombre, LocalDate fechaNacimiento, String Poblacion) {
        this.nif = nif;
        this.nombre = nombre;
        this.fechaNacimiento = comprobarEdad(fechaNacimiento);
        this.Poblacion = Poblacion;
    }


    private LocalDate comprobarEdad(LocalDate fechaNacimiento) {
        int edad = LibDate.extraerEdad(fechaNacimiento);
        if (edad < 18) {
            throw new IllegalArgumentException("No se pueden registrar menores de edad");
        }
        return fechaNacimiento;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(nif, socio.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nif);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", Poblacion='" + Poblacion + '\'' +
                '}';
    }
}
