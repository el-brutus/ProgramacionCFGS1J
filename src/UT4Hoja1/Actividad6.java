package UT4Hoja1;
public class Actividad6 {
    public static void main(String[] args){
        double[] array = new double[4];
        array[0] = 0.21;
        //{0.21,0,0,0}
        array[1] = 4.31;
        //{0.21,4.31,0,0}
        array[2] = 9.28;
        //{0.21,4.31,9.28,0}

        int j = 3;
        System.out.println("posicion " + j +  " valor " + array[j]);
        //{0.21,4.31,9.28,0}
        //Muestra la posicion 3 con valor 0
        System.out.println("posicion " + (j-1) + " valor " + array[j-1]);
        //{0.21,4.31,9.28,0}
        //Muestra la posicion 2
        j = j-2;
        System.out.println("posicion " + j + " valor " + array[j]);
        //{0.21,4.31,9.28,0}
        //Muestra la posicion 1 con valor 4.31
    }
}
