package com.BYjosep04.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(1.5, 3.2);
        Punto punto2 = new Punto();
        System.out.println(punto1.distancia(punto2));
        System.out.println("Punto 1" + punto1);
        System.out.println("Punto 2" + punto2);
    }
}
