package com.BYjosep04.ejercicio6;

import java.util.Objects;

public abstract class Multimedia  {
    private String titulo;
    private String autor;
    private TipoMultimedia tipo;
    private int year;

    public Multimedia(String titulo, String autor, int year, TipoMultimedia tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
        this.tipo = tipo;

    }



    /*
        GETERS
     */

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public TipoMultimedia getTipo() {
        return tipo;
    }

    public int getYear() {
        return year;
    }


    /*
        SETERS
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTipo(TipoMultimedia tipo) {
        this.tipo = tipo;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return  Objects.equals(titulo, that.titulo) && Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }

    @Override
    public String toString() {
        return "Multimedia{\n" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tipo=" + tipo +
                ", year=" + year +
                '}';
    }

    public String toStringForBucle() {
        return
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tipo=" + tipo +
                ", year=" + year +
                '}';
    }
}
