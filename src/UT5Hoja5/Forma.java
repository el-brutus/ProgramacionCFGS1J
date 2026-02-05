package UT5Hoja5;

public abstract class Forma {
    protected int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;
    }

    public abstract int getArea();
    public abstract int getPerimeter();
}
