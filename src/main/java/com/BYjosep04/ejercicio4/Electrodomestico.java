package com.BYjosep04.ejercicio4;



public class Electrodomestico {
    private final double precioBase;
    private final Colores color;
    private final Consumo consumoEnergetico;
    private final double peso;

    public Electrodomestico(double precioBase, Colores color,
                            Consumo consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
        this(100.0, Colores.BLANCO, Consumo.F, 5);
    }
    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, Colores.BLANCO, Consumo.F, peso);
    }


    public double precioFinal() {
        double precioFinal= precioBase;
        switch (this.consumoEnergetico){
            case A -> precioFinal += 100;
            case B -> precioFinal += 80;
            case C -> ;
            case D -> ;
            case E -> ;
            case F -> ;
        }
    }


    /*

    GETERS

     */
    public double getPrecioBase() {
        return precioBase;
    }

    public Colores getColor() {
        return color;
    }

    public Consumo getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }


}
