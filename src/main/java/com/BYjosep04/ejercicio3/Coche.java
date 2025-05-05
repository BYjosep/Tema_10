package com.BYjosep04.ejercicio3;


import java.util.Arrays;

public abstract class Coche {
    private final String matricula;
    private int velocidadActual;
    private int marchaActual;
    private int[] marchasVecidadMaxima;

    public Coche (String matricula, int[] marchasVecidadMaxima) {
        this.matricula = matricula;
        this.velocidadActual = 0;
        this.marchaActual = 0;
        this.marchasVecidadMaxima = marchasVecidadMaxima;
    }


    public void acelerar(int velocidadAceleracion) throws IllegalArgumentException{
        if(velocidadAceleracion < 0){
            throw new IllegalArgumentException("La velocidad debe ser mayor que 0, no pretendas acelerar frenando");
        }

        if(velocidadAceleracion+ velocidadActual<marchasVecidadMaxima[marchaActual]) {
            velocidadActual += velocidadAceleracion;
        }else {
            velocidadActual = marchasVecidadMaxima[marchaActual];
        }

    }

    public void frenar(int velocidadParada) throws IllegalArgumentException{
        if(velocidadParada < 0){
            throw new IllegalArgumentException("La velocidad de freno debe de ser positiva, no se puede parar pisando el acelerador");
        }
        else if (velocidadActual-velocidadParada < 0){
            throw new IllegalArgumentException("La velocidad total debe ser mayor o igual que 0, la velocidad actual es: " + velocidadActual);
        }
        else {
            velocidadActual -= velocidadParada;
        }

    }

    protected void cambiarMarcha(int marcha) throws IllegalArgumentException {
        if (marcha < 0){
            throw new IllegalArgumentException("No se pueden usar marchas negativas.");
        }
        marchaActual = marcha;
    }


    public String getMatricula() {
        return matricula;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getMarchaActual() {
        return marchaActual;
    }
    public int getVelocidadMaximaDeUnaMarcha(int marcha) {

        return marchasVecidadMaxima[marcha];
    }

    public int saberNumeroDeMarchas(){
        return marchasVecidadMaxima.length;
    }

    protected void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    protected void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }
    protected void modificarVelocidadesYMarchas(int[] marchasVecidadMaxima) {
        this.marchasVecidadMaxima = marchasVecidadMaxima;
    }



    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", marchaActual=" + marchaActual +
                ", marchasVecidadMaxima=" + Arrays.toString(marchasVecidadMaxima) +
                '}';
    }
}
