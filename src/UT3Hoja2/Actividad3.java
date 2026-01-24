package UT3Hoja2;

public class Actividad3 {
    public static void main(String[] args){
    Punto primero = new Punto();
    primero.setX(6);
    primero.setY(5);
    Punto segundo = new Punto();
    segundo.setX(3);
    segundo.setY(1);
/*        System.out.println("distancia(0,0)= " + primero.distancia(primero));
        System.out.println("distancia(segundo)= " + primero.distancia(segundo));
  */
        System.out.println("distancia(0,0)= " + primero.distancia());
        System.out.println("distancia(segundo)= " + primero.distancia(segundo));
        System.out.println("distancia(2,2)= " + primero.distancia(2, 2));
        Punto punto = new Punto();
        System.out.println("distancia()= " + punto.distancia());
    }
}
