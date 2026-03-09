package Examen2;

import java.util.*;

public class main {
    static ArrayList<Habitacion> habitacions= new ArrayList<>();
    static Set<Cliente> clientes= new HashSet<>();
    static Scanner sc = new Scanner(System.in);
    static LinkedList<Reserva> reservas=new LinkedList<>();
    static Hotel hotel = new Hotel();
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("12345678A", "Paco");
        Cliente cliente2 = new Cliente("12345678B", "Jose");
        clientes.add(cliente1);
        clientes.add(cliente2);
        Habitacion habitacion1 = new Habitacion(1, Habitacion.tipo.DOBLE,true);
        Habitacion habitacion2 = new Habitacion(2, Habitacion.tipo.SIMPLE,false);
        Habitacion habitacion3 = new Habitacion(3, Habitacion.tipo.SIMPLE,true);
        Habitacion habitacion4 = new Habitacion(4, Habitacion.tipo.DOBLE,false);
        boolean nosalir= true;
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        hotel.agregarHabitacion(habitacion3);
        hotel.agregarHabitacion(habitacion4);
        hotel.registrarCliente(cliente1);
        hotel.registrarCliente(cliente2);
        int opcion;
        while (nosalir){
            imprimirmenu();
            System.out.println("Introduce una opcion: ");
            opcion= sc.nextInt();
            switch (opcion){
                case 1:

                    reservar();
                    break;
                case 2:
                    cancelarreserva();
                    break;
                case 3:
                    hotel.listarreservas();
                    break;
                case 4:
                    hotel.listarhab();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    nosalir=false;
                    break;
                default:
                    System.out.println("Esa no es una opcion valida");
                    break;

            }
        }

    }


    static void imprimirmenu(){
        System.out.println("--------MENU--------");
        System.out.println("1 Reservar Habitacion");
        System.out.println("2 Cancelar reserva");
        System.out.println("3 Listar reservas");
        System.out.println("4 Listar habitaciones disponibles");
        System.out.println("5 Salir");
    }
    static void reservar(){
        sc.nextLine();
        System.out.println();
        System.out.print("Introduce el dni de la persona: ");
        String dni = sc.nextLine();


            System.out.println();
            System.out.print("Introduce el numero de la habitacion: ");
            int numero = sc.nextInt();

            System.out.println();
            System.out.print("Introduce el numero de noches: ");
            int noches = sc.nextInt();
            hotel.reservarHab(dni, numero, noches);
    }
    static void cancelarreserva(){
        sc.nextLine();
        System.out.println();
        System.out.print("Introduce el numero de la habitacion de la reserva: ");
        int numero= sc.nextInt();
        hotel.cancelarReserva(numero);
    }


}
