package lib;

import java.util.Scanner;

public class InDatos {
    public static Scanner sc = new Scanner(System.in);

    public String scanText(){
        return sc.nextLine();
    }

    public static void cerrar(){
        sc.close();
    }
}
