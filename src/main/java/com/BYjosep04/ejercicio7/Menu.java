package com.BYjosep04.ejercicio7;

import lib.Int.LibInInts;
public class Menu {


    public static int primerMenu() {

        return LibInInts.ingresarUnNumero("""
                |           MENU        |
                |-----------------------|
                | 1. Seleccionar evento |
                | 2. Agregar evento     |
                | 3. Eliminar evento    |
                |-----------------------|
                | 0. Salir              |
                """,0,2,"La opcion seleccionada no se puede seleccionar");
    }

    public static int gestionEstadion() {

        return LibInInts.ingresarUnNumero("""
                |                GESTION DE ESTADIO     |
                |---------------------------------------|
                | 1. Venta de entradas                  |
                | 2. Devolver una entrada               |
                | 3. Listado de localidades ocupadas    |
                | 4. Listado de localidades libres      |
                | 5. Mostrar recaudación del partido    |
                |---------------------------------------|
                | 0. Volver al menú principal           |
                |---------------------------------------|
                """);
    }
}
