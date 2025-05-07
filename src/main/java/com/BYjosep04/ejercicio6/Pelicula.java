package com.BYjosep04.ejercicio6;

public class Pelicula extends Multimedia implements Comparable<Pelicula> {
    private int duracion;
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, int year, TipoMultimedia tipo, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, year, tipo);
        this.duracion = duracion;
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }


    /*
        GETERS
     */

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    /*
        SETERS
     */

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        String sb = "Pelicula{\n" +
                "\tTitulo: " + getTitulo() + ",\n" +
                "\tAutor: " + getAutor() + ",\n" +
                "\tYear: " + getYear() + ",\n" +
                "\tTipo: " + getTipo() + ",\n" +
                "\tDuracion: " + getDuracion() + ",\n" +
                "\tActorPrincipal: " + getActorPrincipal() + ",\n" +
                "\tActrizPrincipal: " + getActrizPrincipal() + ",\n" +
                "\n}";
        return sb;
    }

    @Override
    public String toStringForBucle() {
        String sb = "\tTitulo: " + getTitulo() + ",\n" +
                "\tAutor: " + getAutor() + ",\n" +
                "\tYear: " + getYear() + ",\n" +
                "\tTipo: " + getTipo() + ",\n" +
                "\tDuracion: " + getDuracion() + ",\n" +
                "\tActorPrincipal: " + getActorPrincipal() + ",\n" +
                "\tActrizPrincipal: " + getActrizPrincipal() + ",\n";
        return sb;
    }


    @Override
    public int compareTo(Pelicula pelicula) {
        return this.getTitulo().compareTo(pelicula.getTitulo());
    }
}
