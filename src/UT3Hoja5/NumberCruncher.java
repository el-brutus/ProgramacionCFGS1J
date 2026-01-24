package UT3Hoja5;
public class NumberCruncher {
    private int numero;

    public NumberCruncher(int numero){
        this.numero = numero;
    }

    public int get(){
        return numero;
    }
    public int doble(){
        return numero *2;
    }
    public int triple(){
        return numero * 3;
    }
    public int cuadrado(){
        return numero*numero;
    }
    public int cubo(){
        return numero*numero*numero;
    }

    public static void main(String[] args){
        NumberCruncher numero = new NumberCruncher(2);

        System.out.println("Numero: " + numero.get());
        System.out.println("Doble del numero: " + numero.doble());
        System.out.println("Triple del numero: " + numero.triple());
        System.out.println("Numero al cuadrado: " + numero.cuadrado());
        System.out.println("Numero al cubo: " + numero.cubo());
    }
}
