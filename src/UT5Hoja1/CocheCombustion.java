package UT5Hoja1;

public class CocheCombustion extends Coche {

    private int marcha;

    public CocheCombustion(String nombre, int velocidad, int ruedas, int marcha) {
        super(nombre, velocidad, ruedas);
        this.marcha = marcha;
    }

    public void cambiarMarcha(int nuevaMarcha) {
        marcha = nuevaMarcha;
    }
}

