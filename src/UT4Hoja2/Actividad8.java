package UT4Hoja2;

import java.util.Arrays;

public class Actividad8 {
    public static void main(String[] args){
        double[] array= {-47.39,24.96,-1.02,3.45,14.21,32.6,19.45};
        double sum = 0;
        for (double total: array)
            sum += total;

        System.out.printf("La media del array es: " +
                Arrays.toString(array),
                sum/array.length
        );


    }
}
