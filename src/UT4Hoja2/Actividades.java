package UT4Hoja2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {

        int[] array;
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es el tamaño del array? ");
        int size = sc.nextInt();

        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserta un entero: ");
            array[i] = sc.nextInt();
        }
        //Actividad 2
        /*
        *El maximo de la coleccion es el 24
        *Para averiguarlo he mirado todos los valores del array y el 24 ha sido el mas alto
        */


    }

}
