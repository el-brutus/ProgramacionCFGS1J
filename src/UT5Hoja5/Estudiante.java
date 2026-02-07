package UT5Hoja5;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int edad;
    private int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return getNombre() + ", Edad: " + getEdad() + ", Altura: " + getAltura();
    }

    @Override
    public int compareTo(Estudiante o) {
        if (this.altura == o.altura) {
            return Integer.compare(o.edad, this.edad);
        }
        return Integer.compare(o.altura, this.altura);
    }
}
