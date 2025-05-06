package com.BYjosep04.ejercicio6;

public class Pelicula extends Multimedia {
    private int duracion;
    private  String actorPrincipal;
    private  String actrizPrincipal;

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

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    /*
        SETERS
     */

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{\n");
        sb.append("\tTitulo: ").append(getTitulo()).append(",\n");
        sb.append("\tAutor: ").append(getAutor()).append(",\n");
        sb.append("\tYear: ").append(getYear()).append(",\n");
        sb.append("\tTipo: ").append(getTipo()).append(",\n");
        sb.append("\tDuracion: ").append(getDuracion()).append(",\n");
        sb.append("\tActorPrincipal: ").append(getActorPrincipal()).append(",\n");
        sb.append("\tActrizPrincipal: ").append(getActrizPrincipal()).append(",\n");
        sb.append("\n}");
        return sb.toString();
    }
}
