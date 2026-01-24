package UT4Hoja6;

public class Actividad10 {
    public static void main(String[] args){
        int[][] ventas = new int[52][7];
        double promedio = 0;

        for (int i = 0;i < ventas.length; i++){
            promedio += ventas[i][6];
        }
        double promediodom = promedio / ventas.length;
        System.out.println("Este es el promedio de los domingos" + promediodom);
    }
}
