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

                case 1://imprimir vuelos
                    System.out.println("Has elegido la opcion 1");
                    imprimirvuelos();
                    break;
                case 2://Buscar vuelo por numero
                    System.out.println("Has elegido la opcion 2");
                    buscarvuelo();
                    break;
                case 3://buscar vuelo por clave
                    buscarclave();
                    break;
                case 4:
                    System.out.println("Has elegido la opcion 4");
                    anyadirvuelo();
                    break;

                case 5://eliminar vuelo por numero
                    eliminarvuelo();
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
        if (vuelos.isEmpty()){
            System.out.println("No hay vuelos que imprimir");
        }
        for (VUELO vuelo: vuelos){
            System.out.println(vuelo);
        }
    }

    public static void buscarclave(){
        scanner.nextLine();
        System.out.println();
        System.out.print("Introduce una clave para buscar");
        String clave = scanner.nextLine();

        if (clave.equalsIgnoreCase("origen")){
            System.out.println();
            System.out.print("Introduce el origen para ver los vuelos con ese origen: ");
            String origen = scanner.nextLine();
            for (VUELO vuelo : vuelos){
                if (vuelo.getOrigen().equalsIgnoreCase(origen)){
                    System.out.println(vuelo);
                }else {
                    System.out.println("No hay ningun vuelo con ese origen");
                }
                break;
            }
        }
        if (clave.equalsIgnoreCase("destino")){
            System.out.println();
            System.out.print("Introduce el destino para ver los vuelos con ese destino: ");
            String destino = scanner.nextLine();
            for (VUELO vuelo: vuelos){
                if (vuelo.getDestino().equalsIgnoreCase(destino)){
                    System.out.println("Vuelo buscado por destino: "+ vuelo);
                }else{
                    System.out.println("No hay vuelos con ese destino");
                }
                break;
            }
        }
        if (clave.equalsIgnoreCase("dia")){
            System.out.println();
            System.out.print("Introduce el dia para ver los vuelos con esa fecha: ");
            String dia = scanner.nextLine();
            for (VUELO vuelo: vuelos){
                if (vuelo.getDia().equalsIgnoreCase(dia)){
                    System.out.println("Vuelo buscado por dia: "+ vuelo);
                }else{
                    System.out.println("No hay vuelos con ese dia");
                }
                break;
            }
        }
        if (clave.equalsIgnoreCase("clase")){
            System.out.println();
            System.out.print("Introduce el destino para ver los vuelos con esa clase: ");
            String clase = scanner.nextLine();
            for (VUELO vuelo: vuelos){
                if (vuelo.getTipoclase().equalsIgnoreCase(clase)){
                    System.out.println("Vuelo buscado por clase: "+ vuelo);
                }else{
                    System.out.println("No hay vuelos con esa clase");
                }
                break;
            }
        }
        if (!clave.equalsIgnoreCase("Clase")
                ||clave.equalsIgnoreCase("Dia")
                ||clave.equalsIgnoreCase("destino")
                        ||clave.equalsIgnoreCase("origen")
                ){
            System.out.println("No existe la clave introducida");
        }

    }
    public static void buscarvuelo(){
        scanner.nextLine();
        System.out.println();
        System.out.print("Introduce el numero del vuelo: ");
        String numero = scanner.nextLine();
        for (VUELO vuelo : vuelos){
            if (!vuelo.getNvuelo().equals(numero)){
                System.out.println("El numero de vuelo no coincide con ninguno");
            }
            if (vuelo.getNvuelo().equals(numero)){
                System.out.println("Vuelo encontrado: ");
                System.out.println(vuelo);
            }
            break;
        }

    }
    public static void eliminarvuelo(){
        scanner.nextLine();
        System.out.println();
        System.out.print("Introduce el numero del vuelo: ");
        String numero = scanner.nextLine();
        for (VUELO vuelo : vuelos){
            if (vuelo.getNvuelo().equals(numero)){
                vuelos.remove(vuelo);
                System.out.println("Vuelo eliminado correctamente.");
            }else {
                System.out.println("El vuelo no existe o el numero es incorrecto");
            }
            break;
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
