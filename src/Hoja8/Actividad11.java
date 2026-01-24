package Hoja8;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Actividad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 1 para sumar");
        System.out.println("Introduce 2 para restar");
        System.out.println("Introduce 3 para explotar el planeta");
        System.out.println("Introduce 4 para aprobar algo");
        System.out.println("Introduce 5 para salir del programa");
        System.out.println("Introduce 0 para salir");
        System.out.println();

        System.out.print("Introduce una opcion: ");
        int opcion;
        boolean numeroverdad = true;
        while (numeroverdad) {
            try {
                opcion = scanner.nextInt();
                if (opcion < 0 || opcion > 5) {
                    System.out.println("Los valores son erroneos introducelos de nuevo");
                    System.out.println("Introduce 1 para sumar");
                    System.out.println("Introduce 2 para restar");
                    System.out.println("Introduce 3 para explotar el planeta");
                    System.out.println("Introduce 4 para aprobar algo");
                    System.out.println("Introduce 5 para ....");
                    System.out.println("Introduce 0 para salir");
                    System.out.println();
                    System.out.print("Introduce una opcion: ");

                } else {

                    System.out.println("Introduce 1 para sumar");
                    System.out.println("Introduce 2 para restar");
                    System.out.println("Introduce 3 para explotar el planeta");
                    System.out.println("Introduce 4 para aprobar algo");
                    System.out.println("Introduce 5 para salir");
                    System.out.println("Introduce 0 para salir");
                    System.out.println();
                    System.out.println("Has elegido la opción " + opcion);
                    System.out.println("Opción valida");
                    System.out.print("Introduce otra opcion si lo requieres: ");
                } if (opcion ==0){
                    break;
                }

            } catch (InputMismatchException e) {


                System.out.println("Introduce 1 para sumar");
                System.out.println("Introduce 2 para restar");
                System.out.println("Introduce 3 para explotar el planeta");
                System.out.println("Introduce 4 para aprobar algo");
                System.out.println("Introduce 5 para ....");
                System.out.println("Introduce 0 para salir");
                System.out.println();
                System.out.println("La opcion no es un numero");
                System.out.print("Introduce otra opcion: ");
                scanner.nextLine();
            }
        }
        System.out.println();
        System.out.println("Saliendo del programa");
    }
}