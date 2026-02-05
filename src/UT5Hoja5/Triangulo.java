package UT5Hoja5;

public class Triangulo extends Forma{
    private int ancho;
    private int alto;
    public Triangulo(int numLados, int ancho, int alto) {
        super(3);
        this.alto=alto;
        this.ancho=ancho;
    }

    @Override
    public int getArea() {
        return (ancho*alto)/2;
    }

    @Override
    public int getPerimeter() {
        return alto + alto + ancho;
    }
}
