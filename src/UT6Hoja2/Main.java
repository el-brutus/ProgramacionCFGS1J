package UT6Hoja2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    private static LinkedList<Cancion> playList = new LinkedList<>();
    public static void main(String[] args){


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

        play(playList);
    }
    public static void play(LinkedList<Cancion> playList) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        boolean adelante = true;

        ListIterator<Cancion> listIterator = playList.listIterator();

        if (playList.isEmpty()) {
            System.out.println("No hay canciones en la playlist");
            return;
        } else {
            System.out.println("Reproduciendo " + listIterator.next().toString());
            imprimirmenu();
        }

        while (!salir) {

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {

                case 0:
                    System.out.println("Saliendo de la playlist");
                    salir = true;
                    break;

                case 1:
                    if (!adelante) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        adelante = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Reproduciendo " + listIterator.next().toString());
                    } else {
                        System.out.println("Has llegado al final de la playlist");
                        adelante = false;
                    }
                    break;

                case 2:
                    if (adelante) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        adelante = false;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Reproduciendo " + listIterator.previous().toString());
                    } else {
                        System.out.println("Estás al inicio de la playlist");
                        adelante = true;
                    }
                    break;

                case 3:
                    if (adelante) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Repitiendo " + listIterator.previous().toString());
                            adelante = false;
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Repitiendo " + listIterator.next().toString());
                            adelante = true;
                        }
                    }
                    break;

                case 4:
                    imprimirplaylist();
                    break;

                case 5:
                    imprimirmenu();
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
    public static void imprimirplaylist(){

        ListIterator<Cancion> listIterator = playList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
    public static void imprimirmenu(){
        System.out.println("-----MENU-----");
        System.out.println("0 -Salir de la lista de reproduccion");
        System.out.println("1 -Reproducir siguiente canción en la lista");
        System.out.println("2 -Reproducir la canción previa");
        System.out.println("3 -Repetir la cancion actual");
        System.out.println("4 -Imprimir la lista de canciones en la playlist");
        System.out.println("5 -Volver a imprimir el menu");
        System.out.print("Introduce una opcion: ");
    }
}
