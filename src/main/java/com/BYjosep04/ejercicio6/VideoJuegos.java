package com.BYjosep04.ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class VideoJuegos extends Multimedia implements Comparable<VideoJuegos> {
    private ArrayList<String> plataformas;

    public VideoJuegos(String titulo, String autor, int year, TipoMultimedia tipo, String... plataformas ) {
        super(titulo, autor, year, tipo);
        this.plataformas= new ArrayList<>();
        this.plataformas.addAll(Arrays.asList(plataformas));
    }

    public String[] getPlataformas(){
        return (String[]) this.plataformas.toArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoJuego{\n");
        sb.append("\tTitulo: ").append(getTitulo()).append("\n");
        sb.append("\tAutor: ").append(getAutor()).append("\n");
        sb.append("\tYear: ").append(getYear()).append("\n");
        sb.append("\tTipo: ").append(getTipo()).append("\n");
        sb.append("\tPlataformas:\n");
        for(String plataforma: getPlataformas()){
            sb.append("\t\t").append(plataforma).append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public String toStringForBucle() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tTitulo: ").append(getTitulo()).append("\n");
        sb.append("\tAutor: ").append(getAutor()).append("\n");
        sb.append("\tYear: ").append(getYear()).append("\n");
        sb.append("\tTipo: ").append(getTipo()).append("\n");
        sb.append("\tPlataformas:\n");
        for(String plataforma: getPlataformas()){
            sb.append("\t\t").append(plataforma).append("\n");
        }

        return sb.toString();
    }

    @Override
    public int compareTo(VideoJuegos videoJuego) {
        return this.getYear() - videoJuego.getYear();
    }
}
