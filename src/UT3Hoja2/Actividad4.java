package UT3Hoja2;

public class Actividad4 {
    public static void main(String[] args){
        Alfombra alfombra = new Alfombra();
        alfombra.setCoste(3.5);
        Suelo suelo = new Suelo();
        suelo.setAncho(2.75);
        suelo.setLargo(4.0);
        Calculadora calculadora = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora.getCosteTotal());
        alfombra = new Alfombra();
        alfombra.setCoste(1.5);
        suelo = new Suelo();
        suelo.setAncho(5.4);
        suelo.setLargo(4.5);
        Calculadora calculadora1 = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora1.getCosteTotal());
    }
}
