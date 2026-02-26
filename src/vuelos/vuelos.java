package vuelos;

import java.util.ArrayList;
import java.util.Scanner;

public class vuelos {
    private static ArrayList<VUELO> vuelos= new ArrayList<>();
    static void main(String[] args){
        boolean salida = false;
        int opcion;
        Scanner scanner = new Scanner(System.in);
        VUELO vuelo1 = new VUELO("2023-01","Valencia","Menorca","15-08", VUELO.clase.TURISTA);
        vuelos.add(vuelo1);
        while (!salida){
            imprimirmenu();
            opcion = scanner.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("Has elegido la opcion 1");
                    imprimirvuelos();


                case 0:
                    System.out.println("Saliendo del programa...");
                    salida = true;

            }
        }
    }
    public static void imprimirmenu(){
        System.out.println("=================================");
        System.out.println("VUELOS DEL AEROPUERTO DE VALENCIA");
        System.out.println("=================================");
        System.out.println("1 - Imprimir todos los vuelos");
        System.out.println("2 - Buscar un numero de vuelo");
        System.out.println("3 - Buscar vuelo por clave");
        System.out.println("4 - Añadir vuelo nuevo");
        System.out.println("5 - Borrar vuelo por numero");
        System.out.println("0 - SALIR");
        System.out.println("---------------------------------");
        System.out.print("Introduce una opcion: ");
    }

    public static void imprimirvuelos(){
        for (VUELO vuelo: vuelos){
            System.out.println(vuelo);
        }
    }
}
