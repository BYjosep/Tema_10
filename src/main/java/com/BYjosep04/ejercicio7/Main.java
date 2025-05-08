package com.BYjosep04.ejercicio7;

import lib.InDatos;
import lib.Int.LibInInts;
import lib.LibDate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static InDatos scann = new InDatos();
    private static Estadio estadio = new Estadio("Estadio aPerder");

    public void main(String[] args) {
        boolean salir = false;
        do {
            salir= gestion();

        }while (salir);
    }

    private static boolean gestion() {
        switch (Menu.primerMenu()){
            case 1->{
                segundoMenu();
            }

            case 2->{

                estadio.agregarEvento(new Evento(scann.scanText(), LibDate.IngresarFecha()));
            }
            case 3->{
                LibInInts.ingresarUnNumero("Ingrese un numero del evento \n"+estadio.getEventos()+"\n",);
                estadio.eliminarEvento();
            }
            case 0->{
                scann.cerrar();
                return true;
            }
            default ->{
                throw new InputMismatchException("No se ha seleccionado una opcion correcta");
            }

        }
        return false;
    }

    private static void segundoMenu(){
        switch (Menu.gestionEstadion()){

        }
    }
}
