package UT4Hoja2;

import java.util.Arrays;

public class Actividad10 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        int[] array2 = {2,3,1,6,5,4,7};

        Arrays.sort(array);
        Arrays.sort(array2);
        String arrayordenado = Arrays.toString(array);
        String array2ordenado = Arrays.toString(array2);

        if (arrayordenado.equals(array2ordenado)){
            System.out.println("Los arrays coinciden");
        }else {
            System.out.println("Los arrays no coinciden");
        }

    }
}
