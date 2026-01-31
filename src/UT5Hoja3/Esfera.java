package UT5Hoja3;

public class Esfera extends Forma{

    private double radio;
    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double area(){
        double area = 4*Math.PI*(radio*radio);

        return area;
    }
}
