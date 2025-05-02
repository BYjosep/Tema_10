package com.BYjosep04.ejercicio1;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto punto) {
        double numero;
        double restaX,restaY;
        restaX = punto.getX() - x;
        restaY = punto.getY() - y;
        numero = (restaX*restaX)+(restaY*restaY);
        return Math.sqrt(numero);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Punto (x,y): ").append("(").append(x).append(", ").append(y).append(")");
    return sb.toString();
    }
}


