package UT3Hoja2;

public class Alfombra {
    private double coste;

    public double getCoste() {
        if (coste < 0 ){
            coste = 0;
        }
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
