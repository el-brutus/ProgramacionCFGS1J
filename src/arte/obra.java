package arte;

import vuelos.VUELO;

import java.util.ArrayList;

public class obra {
    private String nombre;
    private enum tipo{
        ESCULTURA,
        OLEO_SOBRE_MADERA,
        OLEO_SOBRE_LIENZO
    }
    private int precioaprox;
    private String fecha;
    private tipo tipoobra;
    private ArrayList<obra> obras = new ArrayList<>();

    public obra(String nombre, int precioaprox, String fecha, tipo tipoobra, Artista artista) {
        this.nombre = nombre;
        this.precioaprox = precioaprox;
        this.fecha = fecha;
        this.tipoobra = tipoobra;
        this.obras = new ArrayList<>();
    }
}
