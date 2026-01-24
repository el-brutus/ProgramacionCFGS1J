package UT4Hoja1;

public class Actividad5 {
    public static void main(String[] args){
        int array[] = new int[7];
        int indice;

        array[6] = 42;
        //{0,0,0,0,0,0,42}
        indice = 0;
        array[indice] = 71;
        //{71,0,0,0,0,0,42}
        indice = 5;
        array[indice] = 23;
        //{71,0,0,0,0,23,42}
        indice = 3;
        array[2 + 2] = array[indice - 3];
        //{71,0,0,0,71,23,42}
        //Actividad5 parte2
        //Lo que realizaria el codigo seria un array de posicion 6 y con un valor de 3, la posicion se debe a
        //que el indice vale 4 y se suma 2 y el valor es el indice -1
        array[1] = 33;
        indice = 5;
        array[indice]= 14;
        indice = 3;
        array[indice]= 777;
        indice = 4;
        array[indice]= array[indice+1];
        System.out.println(array[4]);
    }
}
