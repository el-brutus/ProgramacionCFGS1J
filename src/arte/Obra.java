package arte;


import java.util.ArrayList;

public class Obra {
    private String nombre;
    public enum tipo{
        ESCULTURA,
        OLEO_SOBRE_MADERA,
        OLEO_SOBRE_LIENZO
    }
    private int precioaprox;
    private int fecha;
    private String artista;
    private tipo tipoobra;
    private ArrayList<Obra> obras = new ArrayList<>();

    public Obra(String nombre,tipo tipoobra , int precioaprox, int fecha, String artista) {
        this.nombre = nombre;
        this.precioaprox = precioaprox;
        this.fecha = fecha;
        this.tipoobra = tipoobra;
        this.artista = artista;
        this.obras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioaprox() {
        return precioaprox;
    }

    public int getFecha() {
        return fecha;
    }

    public String getArtista() {
        return artista;
    }

    public tipo getTipoobra() {
        return tipoobra;
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+", tipo: "+tipoobra+", precio: "+precioaprox+", fecha: "+fecha+", artista: "+artista;
    }
}
