package com.BYjosep04.ejercicio2;

import com.BYjosep04.ejercicio1.Punto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(new Punto(0, 0));
        puntos.add(new Punto(2, 0));
        puntos.add(new Punto(2, 2));
        puntos.add(new Punto(0, 2));
        Poligono poligono = new Poligono(puntos);

        System.out.println(poligono);
        System.out.println("Perimetro" + poligono.perimetro() + "\n\n");

        poligono.translada(4, -3);

        System.out.println(poligono);
        System.out.println("Perimetro" + poligono.perimetro());
    }
}
