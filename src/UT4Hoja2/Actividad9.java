package UT4Hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args){
        int[] array;
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es el tamaño del primer array? ");
        int tamaño = sc.nextInt();

        array = new int[tamaño];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserta un entero para el primer array: ");
            array[i] = sc.nextInt();
        }
        int[] array2;

        System.out.print("¿Cuál es el tamaño del segundo array? ");
        int tamaño2 = sc.nextInt();

        array2 = new int[tamaño2];

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Inserta un entero para el segundo array: ");
            array2[i] = sc.nextInt();
        }
        String arraystring = Arrays.toString(array);
        String array2string = Arrays.toString(array2);
        if (arraystring.equals(array2string)){
            System.out.println("Los arrays " + arraystring + " y el segundo array " + array2string + " coinciden");
        }else {
            System.out.println("Los arrays " + arraystring + " y el segundo array " + array2string + " no coinciden");
        }
    }
}
