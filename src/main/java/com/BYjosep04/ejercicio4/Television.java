package com.BYjosep04.ejercicio4;

public class Television extends Electrodomestico {
    private static final double DEFAULT_PULGADAS = 20;
    private static final boolean DEFAULT_SMART = false;
    private double pulgadas;
    private boolean smartTV;

    public Television(double precio, double peso, String color, char consumo, double pulgadas, boolean smartTV) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.smartTV = smartTV;
    }

    public Television(double precio, double peso) {

    }

    public Television() {
        super();
        this.pulgadas = DEFAULT_PULGADAS;
        this.smartTV = DEFAULT_SMART;
    }
}
