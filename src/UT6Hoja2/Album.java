package UT6Hoja2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String nombre;
    private String artista;
    private ArrayList<Cancion> canciones;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    private Cancion findSong(String nombre){
        for (Cancion cancion : canciones){
            if (cancion.getTitulo().equals(nombre)){
                return cancion;
            }
        }
        return null;
    }

    public boolean addSong(String titulo, double duracion){
        if (findSong(titulo) != null){
        return false;
        }
        Cancion cancion = new Cancion(titulo, duracion);
        this.canciones.add(cancion);
        return true;
    }
    public boolean addToPlayList(int numero, LinkedList<Cancion> reproduccion){
        int indice = numero -1;
        if (indice >= 0 && indice < canciones.size()){
            reproduccion.add(canciones.get(indice));
            return true;
        }
        return false;
    }
    public boolean addToPlaylist(String titulo, LinkedList<Cancion> reproduccion){
        Cancion cancion = findSong(titulo);
        if (cancion != null){
            reproduccion.add(cancion);
            return true;
        }
        return false;
    }
}
