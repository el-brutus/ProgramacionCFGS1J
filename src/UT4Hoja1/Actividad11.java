package UT4Hoja1;
public class Actividad11 {
    public static void main (String[] args) {
        int[] dataA = { 12, 23, 45, 56 };

        double[] dataB = new double[6];

        dataB[0] = dataA[2];
        //dataB[0] vañpr 45
        dataB[3] = dataA[2];
        //dataB[3] valor 45
        dataB[1] = dataA[1];
        //dataB[1] valor 23
        dataB[5] = dataA[0];
        //dataB[5] valor 12

        System.out.println(
                "dataB: " + dataB[0] + ", " + dataB[1] + ", " + dataB[2] + ", "
                        + dataB[3] + ", " + dataB[4] + ", " + dataB[5]
        );
        /*
        *dataB[0] Tiene valor de 45
        *dataB[1] Tiene valor de 23
        *dataB[2] No tiene valor
        *dataB[3] Tiene valor de 45
        *dataB[4] No tiene valor
        *dataB[5] Tiene valor 12
        * */
    }
}
