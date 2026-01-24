package UT4Hoja2;

import java.util.Arrays;

public class Actividad11 {


    public static boolean isArrayOn(int[] src, int[] dst) {
        int contador = 0;
        boolean comprobador;
        for (int i = 0;i < src.length; i++) {
            for (int x = 0; x < dst.length; x++) {
                if (src[i] == dst[x]) {
                    contador++;
                }
            }
        }
        if (contador == dst.length){
            comprobador = true;
        }else {
            comprobador = false;
        }
        return comprobador;
    }
    public static void main (String[]args){
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {2, 3, 4};
        System.out.println(isArrayOn(array1, array2));

    }
}