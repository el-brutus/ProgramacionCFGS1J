package UT5Hoja1;

public class Video {
    protected String titulo;
    protected int minutos;

    public Video(String titulo, int minutos) {
        this.titulo = titulo;
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Minutos: " + minutos;
    }
}