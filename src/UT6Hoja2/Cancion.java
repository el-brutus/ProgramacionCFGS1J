package UT6Hoja2;

public class Cancion {
    private String titulo;
    private double duracion;

    public Cancion(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString(){
        return titulo+": "+duracion;
    }
}
