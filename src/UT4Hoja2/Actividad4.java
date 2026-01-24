package UT4Hoja2;

import java.util.Arrays;

public class Actividad4 {
    public static void main(String[] args) {
        //Actividad4
        int[] array4 = {-35, -13, -77, -46, -82, -2, -26};
        int numerominimo = Arrays.stream(array4).min().orElseThrow();
        System.out.println(numerominimo);
    }
}
