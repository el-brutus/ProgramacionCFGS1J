package UT4Hoja3;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperationsRaulMartinezMora {
    //Sirve para imprimir el array
    public static void imprimirarray(int[] array){

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
//Sirve para revertir el array
    public static void revertir(int[] array){
        int j;
        j = array.length - 1;
        for (int i=0;i < j;){
            int arrayr = array[i];
            array[i] = array[j];
            array[j] = arrayr;
            i++;
            j--;
        }
        imprimirarray(array);
    }
    //Indica el numero mas grande del array
    public static int max(int[] array){
        Arrays.sort(array);
        int max = array.length;
        System.out.println(array[max -1]);
        return max;
    }
    //Indica el numero minimo del array
    public static int min(int[] array){
        Arrays.sort(array);
        int min = 0;
        System.out.println(array[min]);
        return min;
    }
    //Suma los valores del array
    public static int sum(int[] array){
        int suma = 0;
        for (int n : array)
            suma += n;
        System.out.println(suma);
        return suma;
    }
    //Comprueba si un array es igual a otro
    public static boolean igual(int[] array, int[] array2){

        if (array.length != array2.length) {
            System.out.println(false);
             return false;
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] != array2[i]){
                System.out.println("Los arrays no coindicen");
                return false;
            }
        }
        System.out.println("Los arrays coinciden");
        return true;
    }
    //Comprueba si un array es igual a otro sin tener en cuenta el orden
    public static boolean equalsWithoutOrder(int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        return igual(array1, array2);
    }
    //Comprueba si el contenido de un array esta en otro
    public static boolean isArrayOn(int[] array1, int[] array2){
        int contador=0;
        boolean comprobador;
        for(int i = 0;i < array1.length;i++){
            for (int x = 0;x < array2.length;x++){
                if (array1[i] == array2[x]){
                    contador++;
                }
            }
        }
        if (contador == array2.length){
            comprobador = true;
        } else {
            comprobador = false;
        }
        return comprobador;
    }
    //Sirve para ordenar un array
    public static void sort(int[] array){
        for (int i = 0;i < array.length - 1;i++){
            for (int x = 0;x<array.length - 1 - i;x++){
                if (array[x] > array[x + 1]){
                    int ordenar = array[x];
                    array[x] = array[x +1];
                    array[x + 1] = ordenar;
                }
            }
        }
    }
    //Sirve para copiar un array en otro
    public static void copy(int[] array1, int[] array2){
        for(int i =0;i < array1.length; i++){
            array2[i] = array1[i];
        }
    }
    //Sirve para eliminar los numeros primos
    public static void removeOddNumbers(int[] array){
        for (int i = 0;i < array.length;i++){
            //Comprueba que si el numero no da 0 al ser dividido entre 2 el array da 0
            if (array[i]% 2 != 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
//Actividad 3
    //Sirve para imprimir un rango de numeros de x posicion a x posicion
    public static void printRange(int[] array, int start, int end){
        if(end> array.length || start > end || start <= 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.print("[");
        for(int num = start -1;num <= end -1;num++){
            System.out.print(array[num]);
            if (num == end -1) {
                System.out.println("]");

            }else {
                System.out.print(", ");
            }
        }

    }
    //Esta funcion sirve para quitar numeros de un digito
    public static int[] deleteOneDigitNumbers(int[] array){
    int contador = 0;
    for (int num : array){
        //Comprueba que los valores sean correctos
        if (num <= -10 || num >= 10){
            contador++;
        }
    }
    //creamos un nuevo array
    int[] array1 = new int[contador];
    int posicion = 0;
    for (int num : array){
        //Comprobamos los valores
        if (num <=-10 || num >= 10){
            array1[posicion] = num;
            posicion++;
        }
    }
    //Imprimimos array
        System.out.println(Arrays.toString(array1));
    return array1;
    }
    //Esta funcion nos sirve para quitar numeros con digitos
    public static int[] deletetwoDigitNumbers(int[] array){
        int contador = 0;
        for (int num : array){
            //Comprueba si el numero es mayor o igual que -10 y menor o igual que 10 y guarda la posicion
            if (num >= -10 && num <= 10){
                contador++;
            }
        }
        //Creamos un nuevo array para guardar los numeros
        int[] array1 = new int[contador];
        int posicion = 0;
        for (int num : array){
            //Comprueba que los numeros tengan valores correctos
            if (num >=-10 && num <= 10){
                //Le da valores a las posiciones del array
                array1[posicion] = num;
                posicion++;
            }
        }
        //Imprime el array
        System.out.println(Arrays.toString(array1));
        return array1;
    }

}
