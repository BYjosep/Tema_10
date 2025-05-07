package com.BYjosep04.ejercicio2;

import com.BYjosep04.ejercicio1.Punto;

import java.util.ArrayList;

public class Poligono {
    private final ArrayList<Punto> puntos;

    public Poligono(ArrayList<Punto> puntos) {
        this.puntos = puntos;
    }


    public void translada(double x, double y) {
        for (int i = 0; i < puntos.size(); i++) {
            puntos.get(i).setX(puntos.get(i).getX() + x);
            puntos.get(i).setY(puntos.get(i).getY() + y);
        }
    }

    public int numVertices() {
        return puntos.size();
    }

    public double perimetro() {
        double perimetro;
        perimetro = puntos.get(0).distancia(puntos.get(puntos.size() - 1));
        for (int i = 0; i < puntos.size() - 1; i++) {
            perimetro += puntos.get(i).distancia(puntos.get(i + 1));
        }
        return perimetro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poligono{\n");
        for (int i = 0; i < puntos.size(); i++) {
            sb.append(puntos.get(i).toString()).append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
