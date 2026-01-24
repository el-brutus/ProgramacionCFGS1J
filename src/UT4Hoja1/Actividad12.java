package UT4Hoja1;
public class Actividad12 {
    public static void main(String[] args){
        int j = 6;
        int[] array1 = new int[j];
        array1[0] = 10;
        array1[1] = 9;
        array1[2] = 8;
        array1[3] = 7;
        array1[4] = 6;
        array1[5] = 5;
        int[] array2 = new int[j];
        for (int posicion = 0; j > 0;){
            posicion++;
            j--;
            System.out.println(array2[j] = array1[j]);
        }
    }
}
