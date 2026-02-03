package UT5Hoja4;
//En este caso bienes seria una clase padre al tener atributos
public class Bienes {
    protected String descripcion;
    protected double precio;

    public Bienes(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void verbien(){
        System.out.println();
    }

}
