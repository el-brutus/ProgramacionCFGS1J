package UT5Hoja1;

public class VideoMusical extends Video {

    private String artista;
    private String categoria;

    public VideoMusical(String titulo, int minutos, String artista, String categoria) {
        super(titulo, minutos);
        this.artista = artista;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artista: " + artista + ", Categoría: " + categoria;
    }
}

