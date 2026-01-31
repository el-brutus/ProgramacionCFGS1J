package UT5Hoja3;

public class MainPintura {
    public static void main(String[] args){
        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo(20, 35);
        Esfera esfera = new Esfera(15);
        Cilindro cilindro = new Cilindro(30, 10);
        System.out.println(pintura.pintar(rectangulo));
        System.out.println(pintura.pintar(esfera));
        System.out.println(pintura.pintar(cilindro));

    }
}
