package com.BYjosep04.ejercicio4;


import java.util.Objects;

public class Electrodomestico {
    private final double precioBase;
    private final Colores color;
    private final Consumo consumoEnergetico;
    private final double peso;

    public Electrodomestico(double precioBase, String color,
                            char consumo, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public Electrodomestico() {
        this(100.0, " ", 'f', 5);
    }
    public Electrodomestico(double precioBase, double peso) {
        this(precioBase," ", 'f', peso);
    }


    public double precioFinal() {
        double precioFinal= precioBase;
        switch (this.consumoEnergetico){
            case A -> precioFinal += 100;
            case B -> precioFinal += 80;
            case C -> precioFinal += 60;
            case D -> precioFinal += 50;
            case E -> precioFinal += 30;
            case F -> precioFinal += 10;
        }

        if (peso>= 80){
            precioFinal += 100;
        } else if (peso>=50 && peso<= 79) {
            precioFinal += 80;
        } else if (peso>=20 && peso<= 49) {
            precioFinal += 50;
        } else if (peso>=0 && peso<= 19) {
            precioFinal += 10;
        }

        return precioFinal;
    }


    protected Colores comprobarColor(String color) {
        color = color.toLowerCase();
        switch (color) {
            case "black","negro"-> {
                return Colores.NEGRO;
            }
            case "red","rojo"-> {
                return Colores.ROJO;
            }
            case "blue","azul"-> {
                return Colores.AZUL;
            }
            case "grey","gris"-> {
                return Colores.GRIS;
            }
            default -> {
                return Colores.BLANCO;
            }
        }
    }

    /**
     *
     * @param consumo char de la entrada a comprobar
     * @return Devuelve el valor dentro de un enumerado.
     * Si el valor ingresado no se encuentra en el rango de la A a la F el valor por defecto es la F
     */
    protected Consumo comprobarConsumoEnergetico(char consumo){
        consumo = Character.toLowerCase(consumo);
        switch (consumo){
            case 'a' -> {
                return Consumo.A;
            }
            case 'b' -> {
                return Consumo.B;
            }
            case 'c' -> {
                return Consumo.C;
            }
            case 'd' -> {
                return Consumo.D;
            }
            case 'e' -> {
                return Consumo.E;
            }
            default -> {
                return Consumo.F;
            }
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Electrodomestico that = (Electrodomestico) o;
        return Double.compare(precioBase, that.precioBase) == 0 && Double.compare(peso, that.peso) == 0 && color == that.color && consumoEnergetico == that.consumoEnergetico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precioBase, color, consumoEnergetico, peso);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
