package UT4Hoja6;

public class Actividad7 {
    public static void main(String[] args){
        int[][] int2D = new int[5][10];
        for (int i = 0; i < int2D.length; i++) {
            for (int j = 0; j < int2D[i].length; j++) {
                System.out.print(int2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
