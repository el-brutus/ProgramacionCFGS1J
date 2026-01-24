package Hoja8;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Actividad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coordenada;
        System.out.println("Introduce la coordenada X");
        coordenada = scanner.nextInt();
        int m = coordenada;
        try {
            if (m < 0)
                throw new Exception(m + " es un valor negativo en la coordenada X");

            System.out.println("La coordenada esta bien colocada: " + coordenada);
        }catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        //Si introducimos el numero 1000 el programa nos va a soltar el error
        //Si introducimos el numero 50 el bycle termina al no dar error
    }
}