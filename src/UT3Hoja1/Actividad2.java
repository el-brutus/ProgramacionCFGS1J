package UT3Hoja1;

public class Actividad2 {
    public static void main(String[] args) {

        Calculadora calculo1 = new Calculadora();
        calculo1.setPrimerNumero(5.0);
        calculo1.setSegundoNumero(4);
        System.out.println("suma= " + calculo1.getResultadoSuma());
        System.out.println("Resta= " + calculo1.getResultadoResta());
        calculo1.setPrimerNumero(5.25);
        calculo1.setSegundoNumero(0);
        System.out.println("Multiplicacion= " + calculo1.getResultadoMult());
        System.out.println("Division= " + calculo1.getResultadoDiv());
    }
}