package com.BYjosep04.ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;

public class Juegos extends Multimedia {
    private ArrayList<String> plataformas;

    public Juegos(String titulo, String autor, int year, TipoMultimedia tipo,String... plataformas ) {
        super(titulo, autor, year, tipo);
        this.plataformas= new ArrayList<>();
        this.plataformas.addAll(Arrays.asList(plataformas));
    }

    public String[] getPlataformas(){
        return (String[]) this.plataformas.toArray();
    }
}
