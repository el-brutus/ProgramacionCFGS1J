package UT4Hoja1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Arraytester {
    String numeros;

    public static int[] leerEnteros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la longitud del array: ");
        int longitud= scanner.nextInt();
        int[] array = new int[longitud];
        for (int i = 0;i < array.length;i++){
            int numero;
            System.out.println("Introduce un numero al array: ");
            numero = scanner.nextInt();
            array[i] = numero;
        }
        return array;
    }
    public static void imprimirArray(int[] array1){

        System.out.println(Arrays.toString(array1));

    }
    public static void transformarArray(int[] array1){
        int resultado=0;
        int i = 0;
        int j = i;
        while (i < array1.length) {
            if (array1[i] % 2 == 0) {
                System.out.println(array1[i] + " es par");
                String nuevoarray;
            } else {

                System.out.print(array1[i] + " es impar, nuevo valor: ");
                int nuevoresultado = array1[i] = -1;
                System.out.println(nuevoresultado);
                //System.out.println();
            }
            i++;
            continue;
        }
        System.out.println(Arrays.toString(array1));
    }

}
