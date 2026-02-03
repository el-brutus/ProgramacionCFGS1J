package Pruebas;

public class Dinamita extends Cubo implements Explotable{
    public Dinamita(String nombre) {
        super(nombre);
    }

    @Override
    public void explotar() {
        System.out.println("Boooo!!!");
    }
}
