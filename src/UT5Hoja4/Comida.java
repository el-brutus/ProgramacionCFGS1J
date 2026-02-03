package UT5Hoja4;

public class Comida extends Bienes {
    private double calorias;
    private String toString;

    public Comida(String descripcion, double precio) {
        super(descripcion, precio);
        this.calorias= calorias;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", calorias=" + calorias +
                '}';
    }
}
