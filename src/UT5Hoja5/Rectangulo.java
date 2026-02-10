package UT5Hoja5;

public class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo>{
    private int ancho;
    private int alto;
    public Rectangulo(int numLados, int ancho, int alto) {
        super(4);
        this.ancho=ancho;
        this.alto=alto;
    }

    @Override
    public int getArea() {
        return ancho * alto;
    }

    @Override
    public int getPerimeter() {
        return ancho*2 + alto * 2;
    }

    @Override
    public void redimensionar(int x) {
        ancho = ancho*x;
        alto= alto*x;
    }

    @Override
    public int compareTo(Rectangulo x) {
        return this.getArea() - x.getArea();
    }

    @Override
    public String toString() {
        return "Rectangulo [area=" + getArea() + "]";
    }
}
