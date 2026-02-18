package UT6Hoja2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        ArrayList<Album> albums = new ArrayList<>();
        LinkedList<Cancion> playList = new LinkedList<>();

        Album album1 = new Album("The Eminem Show","Eminem");
        album1.addSong("White America", 5.24);
        album1.addSong("Business", 4.11);
        album1.addSong("Cleanin' Out My Closet", 4.57);
        album1.addSong("Soldier", 3.46);
        albums.add(album1);

        Album album2 = new Album("Voces de Ultratumba", "Estopa");
        album2.addSong("Malabares", 3.25);
        album2.addSong("Vacaciones", 3.12);
        album2.addSong("Paseo", 3.36);
        album2.addSong("Gulere Gulere", 3.25);
        albums.add(album2);
        album1.addToPlayList(1, playList);
        album1.addToPlayList(2, playList);
        album1.addToPlayList(3, playList);
        album2.addToPlaylist("Paseo", playList);
        album2.addToPlaylist("Malabares", playList);
        album2.addToPlaylist("Vacaciones", playList);
    }

    public static void imprimirmenu(){
        System.out.println("-----MENU-----");
        System.out.println("0 -Salir de la lista de reproduccion");
        System.out.println("1 -Reproducir siguiente canción en la lista");
        System.out.println("2 -Reproducir la canción previa");
        System.out.println("3 -Repetir la cancan actual");
        System.out.println("4 -Imprimir la list de canciones en la playlist");
        System.out.println("5 -Volver a impair el menu");
        System.out.print("Introduce una opcion: ");
    }
    public static void play(){}
}
