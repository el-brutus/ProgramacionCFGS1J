package Pruebas;

public class Madera extends Cubo implements Incinerable{
    public Madera(String nombre) {
        super(nombre);
    }

    @Override
    public void incinerad() {
        System.out.println("fuegooooo!!!");
    }

    @Override
    public void incinerar() {

    }


}