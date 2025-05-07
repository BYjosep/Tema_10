package com.BYjosep04.ejercicio4;

public class Lavadora extends Electrodomestico {
    private static final int DEFAULT_CARGA = 5;
    private final int carga;

    public Lavadora(int carga, double precio, String color, char consumoElectrico, double peso) {
        super(precio, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public Lavadora(int precio, double peso) {
        super(precio, peso);
        this.carga = DEFAULT_CARGA;

    }

    public Lavadora() {
        super();
        this.carga = DEFAULT_CARGA;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.carga >= 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "Precio final=" + precioFinal() +
                ", color=" + getColor() +
                ", consumoEnergetico=" + getConsumoEnergetico() +
                ", peso=" + getPeso() +
                "carga=" + carga +
                '}';
    }
}
