package com.BYjosep04.ejercicio3;

public class CocheCambioMaunal extends Coche {
    public CocheCambioMaunal(String matricula, int[] marchasVecidadMaxima) {
        super(matricula, marchasVecidadMaxima);
    }
    @Override
    protected void cambiarMarcha(int marcha) {
        if (marcha < 0){
            throw new IllegalArgumentException("No se pueden usar marchas negativas.");
        }
        if (marcha == 0 && super.getVelocidadActual()==0){
            super.setMarchaActual(marcha);
        }else {
            super.frenar(getVelocidadActual());
            super.setMarchaActual(marcha);
        }

        super.setMarchaActual(0);
        super.frenar(3);
        super.setMarchaActual(marcha);

    }
}
