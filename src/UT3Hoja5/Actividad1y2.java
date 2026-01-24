package UT3Hoja5;
class Simple {
    public int devolver(int x) {
        System.out.println("Primer valor del parámetro formal: " + x);
        x = 100;
        System.out.println("Siguiente valor del parámetro formal: " + x );
        return x;
    }
}


public class Actividad1y2 {
    public static void main(String[] args){
        int var = 7;
        int resultado = 0;
        Simple simple = new Simple();
        System.out.println("Primer valor de la variable resultado: " +
                resultado);
        resultado = simple.devolver(var);
        System.out.println("Siguiente valor de la variable resultado: " +
                resultado);
    }
}
/*
        Actividad 3
        Primer valor de la variable resultado: 0 El primer valor imprimido sera 0 ya que nos pide imprimir resultado y en el momento que lo pide su valor es 0
        Primer valor del parámetro formal: 7 El primer valor de la clase simple nos va a imprimir 7 ya que le establecemos que su valor es el mismo que la variable var, por lo que imprime 7
        Siguiente valor del parámetro formal: 100 El siguiente valor de la clase simple sera 100 ya que establece dentro de la clase que resultado sea 100
        Siguiente valor de la variable resultado: 100 En el siguiente valor de la variable resultado nos imprimira 100 ya que resultado ha establecido su valor a 100
*/

        /*
        Actividad1
        Simple simple = new Simple();
        System.out.println("Primer valor de la variable local: " + var);/*Imprime el primer valor de var
        simple.print(var);/*Establece que el valor de simple se establece como 7
        System.out.println("Siguiente valor de la variable local: " + var);/*Imprime el valor var con el valor 7 de nuevo
        */
        /*
        Actividad 2
        Primer valor de la variable local: 7 Vamos a seguir imprimiendo 7 ya que el var tiene ese valor
        Primer valor del parámetro formal: 7 En el primer var de la clase simple vamos a seguir imprimiendo 7 ya que hemos establecido que este sea su valor
        Siguiente valor del parámetro formal: 100 En el siguiente valor de la clase simple vamos a imprimir 100 ya que es el valor que le hemos establecido dentro de la classe
        Siguiente valor de la variable local: 7 En el siguiente valor de la variable local vamos a imprimir de nuevo 7 ya que es el valor que esta establecido dentro de su clase
        En conclusión, seguimos imprimiendo 7 ya que el valor 100 solo esta establecido para el segundo valor de dentro de la clase simple
         */


