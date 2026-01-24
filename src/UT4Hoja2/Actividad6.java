package UT4Hoja2;

import java.util.Arrays;

public class Actividad6 {
    public static void main(String[] args){
        int[] pagoSemanal = {987,688,1324,450,667,801};
        int sum=0;

        for (int total: pagoSemanal)
            sum += total;
        System.out.println(sum);
        //Para corregir este codigo he cambiado el 6 del bucle for por un 5 ya que la longitud es de 6
        //Si pusieramos 6 la longitud tendria que ser de 7 ya que se cuenta el 0


    }
}
