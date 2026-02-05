package UT5Hoja5;

public class Chucho extends Animal{
    public Chucho(String nombre) {
        super(nombre);
    }

    @Override
    public String abstract_method() {
        return "Este es un método abstracto implementado en una clase no abstracta";
    }
}
