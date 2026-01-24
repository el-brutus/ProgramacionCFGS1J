package UT4Hoja6;

import java.util.Arrays;

public class Actividad3 {
    public static void main(String[] args){
        int[][] matriz = { { 1, 9, 4 },
                { 0, 2 },
                { 0, 1, 2, 3, 4 } };

        System.out.println("matriz[0][2] is " + matriz[0][2] );
        System.out.println("matriz[1][1] is " + matriz[1][1] );
        //System.out.println("matriz[1][2] is " + matriz[1][2] );

        matriz[2][4] = 97;
        //matriz[1][4] = 97;
        int val = matriz[0][2];
        //int sum = matriz[1][2];
        //El programa da error ya que la fila 1 no tiene columna 2
        /*
        * a: [0][2]=4, [1][1]=2, [2][5]=No existe ya que 5 supera el limite de 4, [3][0]= no existe ya que 3 supera las filas que hay
        * b: La longitud de la matriz es de 3 ya que tiene 3 filas , se puede comprobar con un matriz.length
        * c: La fila uno tiene una longitud de 3, la segunda fila tiene una longitud de 2 y la tercera fila es de 5, se pude mirar con un matriz[].length
        * d: Para remplazarlo debemos hacerlo de esta manera matriz[0]= new int[]{1, 2, 3};
        *
        * */
        //e:
        for (int i = 0;i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
