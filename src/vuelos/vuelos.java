package vuelos;

import java.util.ArrayList;
import java.util.Scanner;

public class vuelos {
    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<VUELO> vuelos= new ArrayList<>();
    static void main(String[] args){
        boolean salida = false;
        int opcion;
        VUELO vuelo1 = new VUELO("2023-01","Valencia","Menorca","15-08", VUELO.clase.TURISTA);
        vuelos.add(vuelo1);

        while (!salida){
            imprimirmenu();
            opcion = scanner.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("Has elegido la opcion 1");
                    imprimirvuelos();
                    break;
                case 4:
                    System.out.println("Has elegido la opcion 4");
                    anyadirvuelo();
                    break;
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
    public static void anyadirvuelo(){
        boolean existe = false;
        System.out.println();
        scanner.nextLine();
        System.out.print("Introduce el numero del vuelo: ");
        String nvuelo= scanner.nextLine();
        System.out.println();
        System.out.print("Introduce el origen del vuelo: ");
        String origen= scanner.nextLine();
        System.out.println();
        System.out.print("Introduce el destino: ");
        String destino=scanner.nextLine();
        System.out.println();
        System.out.print("Introduce el dia en formato DD/MM: ");
        String dia=scanner.nextLine();
        System.out.println();
        System.out.print("Introduce la clase Turista/Primera: ");
        String clase = scanner.nextLine();
        for (VUELO vuelo : vuelos){
            if (vuelo.getNvuelo().equalsIgnoreCase(nvuelo)){
                System.out.println("El vuelo ya existe");
                existe=true;
                break;
            }
        }
        if (!existe) {
            if (clase.equalsIgnoreCase("turista")) {
                VUELO vuelo = new VUELO(nvuelo, origen, destino, dia, VUELO.clase.TURISTA);
                vuelos.add(vuelo);
                System.out.println("Vuelo de clase turista añadido");
            }
            if (clase.equalsIgnoreCase("primera")) {
                VUELO vuelo = new VUELO(nvuelo, origen, destino, dia, VUELO.clase.PRIMERA);
                vuelos.add(vuelo);
                System.out.println("Vuelo de primera clase añadido");
            }
        }
    }
}
