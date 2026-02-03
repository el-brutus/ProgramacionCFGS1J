package UT5Hoja4;

public class Juguete extends  Bienes implements Imponible{
    private int edad;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edad = edadMinima;
    }

    @Override
    public String toString(){
        return descripcion + ", edad minima: "+ edad;
    }
}
