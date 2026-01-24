package Hoja8;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Actividad8y9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero;
        numero = scanner.nextInt();
        int m = numero;
        try {
            System.out.println("Entrando en el try");
            if (m > 100)
                throw new Exception(m + " es muy grande");

            System.out.println("Saliendo del bucle try");
        }catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        //Si introducimos el numero 1000 el programa nos va a soltar el error
        //Si introducimos el numero 50 el bycle termina al no dar error
    }
}