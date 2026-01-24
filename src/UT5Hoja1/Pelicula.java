package UT5Hoja1;

public class Pelicula extends Video {
    private String director;
    private int valoracion;

    public Pelicula(String titulo, int minutos, String director, int valoracion) {
        super(titulo, minutos);
        this.director = director;
        this.valoracion = valoracion;
    }
}