package CalcularLetraDNI;

import java.util.Scanner;

public class dniraulmartinezmora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dni = "TRWAGMYFPDXBNJZSQVHLCKE";
        int i = 1;
        while (i > 0){

            System.out.println("Introduce un dni sin letra para comprobarlo o introduce 0 para salir del programa: ");

            if (!scanner.hasNextInt()) {
                System.out.println("El parametro introducido no es un numero.");
                System.out.println("Introducelo de nuevo. ");
                scanner.next();
                continue;
            }
            int dninum = scanner.nextInt();
            if (dninum == 0){
                System.out.println("Saliendo del programa...");
                break;
            }
            if (dninum < 1000000) {
                System.out.println("El número introducído es invalido");
                System.out.println("Introduzcalo de nuevo: ");
                continue;
            }


            int resto = dninum % 23;
            char posicion;
            posicion = dni.charAt(resto);
            System.out.println("Tu dni con letra es: "+ dninum + "" + posicion);

        }


    }
}

