package UT5Hoja3;

public class Rectangulo extends Forma{
    private double largo;
    private double ancho;

    public Rectangulo (double largo, double ancho){
        super("");
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public  double area(){
        return largo * ancho;
    }


}