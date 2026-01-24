package UT4Hoja6;

import java.util.Arrays;

public class Actividad4 {
    public static void main(String[] args){
      int[][] matriz = {null,
              {1,1},
              {0,3},
              {0,1,2,3,4},
              null };
        System.out.print("[");
      for (int i = 0;i < matriz.length;i++){
          if (matriz[i]==null){
              System.out.print("Fila vacia");
          } else {
              System.out.print(Arrays.toString(matriz[i]));
          }
          if (i < matriz.length - 1){
              System.out.print(", ");
          }
      }
        System.out.print("]");
    }
}
