package UT5Hoja3;

public abstract class Forma {
    public String nombre;

    public Forma(String nombre){
        this.nombre = nombre;
    }
    public double area(int area){
        return 0;
    }

    @Override
    public String toString(){
        return nombre;
    }

    public abstract double area();
}