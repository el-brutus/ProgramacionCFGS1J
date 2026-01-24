package UT4Hoja3;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Actividad1 {
    public static void revertir(int[] array){
        int j;
        j = array.length - 1;
        System.out.println(Arrays.toString(array));
        for (int i=0;i < j;){
            int arrayr = array[i];
            array[i] = array[j];
            array[j] = arrayr;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args){
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        revertir(array);
    }
}
