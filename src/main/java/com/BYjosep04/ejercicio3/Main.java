package com.BYjosep04.ejercicio3;

import lib.Int.LibInInts;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }

    private static void cocheManual() {
        Coche cocheManual = new CocheCambioMaunal(pedirMatricula(), ingresarMarchasYVelocidadMaxima());

    }

    private static void cocheAutomatico() {
        Coche cocheAutomatico = new CocheCambioAutomatico(pedirMatricula(), ingresarMarchasYVelocidadMaxima());

    }

    // No se esta verificando los datos
    private static String pedirMatricula() {
        return scanner.nextLine();
    }


    /**
     * @return devuelve el array con las marchas y las velocidades maximas ya puesto
     */
    private static int[] ingresarMarchasYVelocidadMaxima() {
        int[] cajaDeCambios;

        cajaDeCambios = new int[LibInInts.ingresarUnNumero(
                "Ingrese el número de marchas del vehículo: ",
                1, Integer.MAX_VALUE,
                "No se pueden ingresar valores menor a 1, no tiene sentido tener menos de una marcha")];

        for (int i = 1; i < cajaDeCambios.length; i++) {
            cajaDeCambios[i] = LibInInts.ingresarUnNumero(
                    "Ingresa la velocidad maxima de la marcha " + i + ":",
                    cajaDeCambios[i] + 1, Integer.MAX_VALUE,
                    "No puedes ingresar un valor igual o menor a la marcha anterior"
            );
        }

        return cajaDeCambios;
    }
}
