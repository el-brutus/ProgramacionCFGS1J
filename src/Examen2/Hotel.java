package Examen2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Hotel {
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();
    private LinkedList<Reserva> reservas= new LinkedList<>();
    private Set<Cliente> clientes= new HashSet<>();

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public LinkedList<Reserva> getReservas() {
        return reservas;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    // 6
    public String BuscarCli(String dni){
        if (clientes.isEmpty()){
            System.out.println("No hay clientes");
        }

        for (Cliente cliente : clientes){
            if (cliente.getDni().equalsIgnoreCase(dni)){
                return cliente.toString();
            }
        }

        return null;
    }
    // 7
    public boolean registrarCliente(Cliente cliente){
        BuscarCli(cliente.getDni());
        clientes.add(cliente);
        return true;
    }
    //8
    public Habitacion BuscarHab(int numero){
        if (habitaciones.isEmpty()){
            System.out.println("No hay habitaciones ");
            return null;
        }
        for (Habitacion habitacion : habitaciones){
            if (habitacion.getNumero()==numero){
                return habitacion;
            }
        }

        return null;
    }
    //9
    public boolean agregarHabitacion(Habitacion habitacion){
        for (Habitacion habitacion1: habitaciones){
            if (habitacion1.getNumero()==habitacion.getNumero()){
                System.out.println("La habitacion ya existe");
                return false;
            }
        }
        habitaciones.add(habitacion);
        return true;
    }
    //10
    public boolean reservarHab(String dni, int numero, int noches){

        boolean correcto=true;
        if (BuscarCli(dni)==null){
            System.out.println("El cliente no existe");
            correcto=false;
        }
        if (BuscarHab(numero)==null){
            System.out.println("Habitacion no disponible");
            correcto=false;
        }


        if (correcto) {
            Reserva reserva = new Reserva(dni, numero, noches);
            System.out.println("Reserva realizada");
            habitaciones.get(numero).ocupada=true;
            reservas.add(reserva);
            return true;
        }
        return false;
    }
    //11
    public boolean cancelarReserva(int numero){
        if (reservas.isEmpty()){
            System.out.println("No hay reservas");
        }
        Habitacion habitacion = habitaciones.get(0);
        for (Habitacion habitacion1: habitaciones){
            if (habitacion1.getNumero()==numero){
                habitacion=habitacion1;
            }
        }
        for (Reserva reserva: reservas){
            if (reserva.getNumero()==numero){
                System.out.println(" Reserva eliminada");
                System.out.println("Habitacion: "+ habitacion.getNumero()+ " liberada.");
                habitacion.ocupada=false;
                reservas.remove(reserva);
                return true;
            }
        }
        return false;
    }
    public void listarreservas(){
        if (reservas.isEmpty()){
            System.out.println("No hay reservas que mostrar");
        }else {
            for (Reserva reserva: reservas){
                System.out.println(reserva);
            }
        }
    }
    public void listarhab(){
        if (habitaciones.isEmpty()){
            System.out.println("No hay habitaciones que mostrar");
        }
        for (Habitacion habitacion:habitaciones){
            if (!habitacion.ocupada){
                System.out.println(habitacion+" ocupada: "+habitacion.isOcupada());
            }
        }
    }

}
