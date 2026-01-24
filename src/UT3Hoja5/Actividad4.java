package UT3Hoja5;
class Punto {
    public int x = 1, y = 2;
}

class PuntoTester {
    public void print(Punto punto) {
        punto.x = 45;
        punto.y = 83;
        System.out.println("x: " + punto.x+ " y: " + punto.y);
    }
}
class Tester {
    public static void main ( String[] args ) {
        Punto pt = new Punto();
        System.out.println("x: " + pt.x+ " y: " + pt.y);
        PuntoTester tester = new PuntoTester();
        tester.print(pt);
        System.out.println("x: " + pt.x+ " y: " + pt.y);
    }
}
/*
  Cambia el valor de x e y ya que primero llamamos a la clase punto donde sus valores son 1 y 2, luego llamamos a PuntoTester donde sus valores son 45 y 83, por lo que el tester.print lo imprime
  Y en el ultimo sout los valores ya han cambiado por lo que los vuelve a imprimir


*/

