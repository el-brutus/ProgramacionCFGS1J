package UT5Hoja1;


public class Coche extends Vehiculo {

    protected int ruedas;

    public Coche(String nombre, int velocidad, int ruedas) {
        super(nombre, velocidad);
        this.ruedas = ruedas;
    }
}

