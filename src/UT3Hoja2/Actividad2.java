package UT3Hoja2;

public class Actividad2 {
    public static void main(String[] args){
    muro muro1 = new muro();
        System.out.println(muro1.toString());
        System.out.println("area= " + muro1.getArea());
        System.out.println("Ancho del muro " + muro1.getAncho());
        System.out.println("Alto del muro " + muro1.getAlto());


        muro muro = new muro();


        System.out.println("area= " + muro.getArea());
        muro.setAlto(-1.5);
        System.out.println("Ancho del muro " + muro.getAncho());
        System.out.println("Alto del muro " + muro.getAlto());
        System.out.println("area= " + muro.getArea());

    }
}
