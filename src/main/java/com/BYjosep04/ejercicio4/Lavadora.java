package com.BYjosep04.ejercicio4;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora(int carga, double precioBase, String color,char consumoElectrico,double peso) {
        super(precioBase, color, consumoElectrico,peso);
        this.carga = carga;
    }
    public Lavadora(int precio, double peso) {
        super(precio,peso);
        this.carga = 5;

    }

    public Lavadora(){
        super();
        this.carga = 5;
    }


}
