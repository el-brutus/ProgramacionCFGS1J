package UT3Hoja5;

public class Actividad10 {
    public static void main(String[] args){
        Cubo cubo = new Cubo();
        cubo.setLado(4);
        System.out.println("resultado paso por valor: " + cubo.getLado());
        System.out.println("resultado paso por valor: " + cubo.area());
        System.out.println("resultado paso por valor: " + cubo.volumen());
        System.out.println("Resultados paso por referencia");
        cubo.cambiar(cubo);
        System.out.println("resultado paso por referencia: "+ cubo.getLado());
        System.out.println("resultado paso por referencia: " + cubo.area());
        System.out.println("resultado paso por referencia: " + cubo.volumen());


    }
}
