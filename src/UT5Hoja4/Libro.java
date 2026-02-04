package UT5Hoja4;

public class Libro extends Bienes implements Imponible {
    private String autor;


    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    @Override

    public String toString(){
        return "Descripcion: " + descripcion + "\n" + "Precio: " + precio + "\n" + " Autor: " + autor;
    }
}
