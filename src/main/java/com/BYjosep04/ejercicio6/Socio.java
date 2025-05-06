package com.BYjosep04.ejercicio6;

import lib.LibDate;

import java.time.LocalDate;

public class Socio {
    private final String nif;
    private String nombre;
    private final LocalDate fechaNacimiento;
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
}
