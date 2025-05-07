package com.BYjosep04.ejercicio3;

public class CocheCambioAutomatico extends Coche {
    public CocheCambioAutomatico(String matricula, int[] marchasVecidadMaxima) {
        super(matricula, marchasVecidadMaxima);
    }

    @Override
    public void frenar(int velocidadParada) throws IllegalArgumentException {
        if (velocidadParada < 0) {
            throw new IllegalArgumentException("No se puede frenar acelerando");
        }
        super.frenar(velocidadParada);
        if (getVelocidadMaximaDeUnaMarcha(getMarchaActual()) >= getVelocidadActual() && getVelocidadMaximaDeUnaMarcha(getMarchaActual() - 1) <= getVelocidadActual()) {
            // No tiene que hacer nada
        } else {
            for (int i = super.getMarchaActual(); i > 0; i--) {
                if (super.getVelocidadMaximaDeUnaMarcha(i) >= getVelocidadActual()) {
                    cambiarMarcha(i);
                    break;
                }
            }
        }
    }

    @Override
    public void acelerar(int velocidadAceleracion) throws IllegalArgumentException {
        if (velocidadAceleracion < 0) {
            throw new IllegalArgumentException("La velocidad debe ser mayor que 0, no pretendas acelerar frenando");
        }
        int velocidadNueva = velocidadAceleracion + getVelocidadActual();
        if (velocidadNueva > getVelocidadMaximaDeUnaMarcha(getMarchaActual())) {
            for (int i = super.getMarchaActual(); i < saberNumeroDeMarchas(); i++) {
                if (velocidadNueva <= getVelocidadMaximaDeUnaMarcha(i)) {
                    cambiarMarcha(i);
                    break;
                }
            }

        }
        super.acelerar(velocidadAceleracion);

    }
}
