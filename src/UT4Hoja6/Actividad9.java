package UT4Hoja6;

public class Actividad9 {
    public static void main(String[] args){
        int[][] ventas = new int[52][7];
        double suma = 0;
        int dias = 52 * 7;
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                suma += ventas[i][j];
            }
        }
        double promedio = suma / dias;
        System.out.println("Este es el promedio " + promedio);
    }
}
