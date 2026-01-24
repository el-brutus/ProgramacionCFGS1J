package UT5Hoja1;

public class Vehiculo {

    protected String nombre;
    protected int velocidad;

    public Vehiculo(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public void mover() {
        System.out.println("El vehículo se está moviendo");
    }

    public void acelerar(int cantidad) {
        velocidad += cantidad;
    }

    public void frenar(int cantidad) {
        velocidad -= cantidad;
    }
}

