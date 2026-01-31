package UT5Hoja3;

import java.text.Normalizer;

public class Pintura {
    private double cobertura;

    public Pintura(double cobertura){
        this.cobertura = cobertura;
    }

    public double pintar(Forma forma){
        return forma.area() / cobertura;
    }
}
