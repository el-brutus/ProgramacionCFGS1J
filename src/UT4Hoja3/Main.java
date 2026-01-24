package UT4Hoja3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();
        int[] array= new int[longitud];
        for (int i = 0;i<array.length;i++){
            System.out.println("Introduce un numero al array: ");
            array[i] = scanner.nextInt();
        }*/
        int[] array= {-2, 45, -29, 77, 56, 31};
        int[] copyarray = new int[array.length];
        int[] arrayord = new int[array.length];

        ArrayOperationsRaulMartinezMora.max(array);
        ArrayOperationsRaulMartinezMora.copy(array, copyarray);
        ArrayOperationsRaulMartinezMora.imprimirarray(array);
        ArrayOperationsRaulMartinezMora.sort(array);
        ArrayOperationsRaulMartinezMora.copy(array, arrayord);
        ArrayOperationsRaulMartinezMora.sort(arrayord);
        ArrayOperationsRaulMartinezMora.imprimirarray(arrayord);
        ArrayOperationsRaulMartinezMora.equalsWithoutOrder(array, arrayord);
        ArrayOperationsRaulMartinezMora.igual(array, copyarray);
        ArrayOperationsRaulMartinezMora.removeOddNumbers(array);
        ArrayOperationsRaulMartinezMora.sum(array);
        ArrayOperationsRaulMartinezMora.min(array);
        int[] array3= {-2, 45, -29, 77, 56, 31};
        ArrayOperationsRaulMartinezMora.printRange(array3, 1, 4);
        ArrayOperationsRaulMartinezMora.revertir(arrayord);
        ArrayOperationsRaulMartinezMora.printRange(arrayord, 2, 5);
        int[] arraydigito = {-1, 33, 100, 9, 7};
        ArrayOperationsRaulMartinezMora.deletetwoDigitNumbers(arraydigito);
        ArrayOperationsRaulMartinezMora.deleteOneDigitNumbers(arraydigito);
        /*System.out.println("Introduce la longitud del primer array: ");
        int longitud1 = scanner.nextInt();
        int[] array1= new int[longitud1];
        for (int i = 0;i<array1.length;i++){
            System.out.println("Introduce un numero al primer array: ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Introduce la longitud del segundo array: ");
        int longitud2 = scanner.nextInt();
        int[] array2= new int[longitud2];
        for (int i = 0;i<array2.length;i++){
            System.out.println("Introduce un numero al segundo array: ");
            array2[i] = scanner.nextInt();
        }
        ArrayOperationsRaulMartinezMora.igual(array1, array2);
        ArrayOperationsRaulMartinezMora.equalsWithoutOrder(array1, array2);
        System.out.println(ArrayOperationsRaulMartinezMora.isArrayOn(array1, array2));
        System.out.println((Arrays.toString(array1)));
        ArrayOperationsRaulMartinezMora.removeOddNumbers(array1);
        int[] arrayr = new int[4];
        arrayr[0] = 1;
        arrayr[1] = 2;
        arrayr[2] = 3;
        arrayr[3] = 4;
        ArrayOperationsRaulMartinezMora.printRange(arrayr, 1, 3);*/
    }
}
