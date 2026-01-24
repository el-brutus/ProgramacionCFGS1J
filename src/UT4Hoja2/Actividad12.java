package UT4Hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad12 {
    public static int[] ordenarArray(int[] array) {
    int[] array2= new int[array.length];
    for (int i = 0;i<array.length;i++) {

        array2[i] = array[i];
    }
    Arrays.sort(array2);
    return array2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del array: ");
        int longitud = sc.nextInt();
        int[] array = new int[longitud];
        for (int i = 0;i<array.length;i++){
            System.out.println("Introduce un numero para el array: ");
            int numero = sc.nextInt();
            array[i] = numero;
        }
        System.out.println(Arrays.toString(ordenarArray(array)));
    }
}
