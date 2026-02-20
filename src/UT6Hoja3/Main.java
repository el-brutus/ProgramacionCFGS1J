package UT6Hoja3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public Map<Integer, Ubicacion> ubicaciones;

    public Main(){
        ubicaciones = new HashMap<>();
        ubicaciones.put(0, new Ubicacion(0,"Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1,"Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2, "Estás bañandote en la playa"));
        ubicaciones.put(3, new Ubicacion(3, "Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un bosque"));

        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("Q", 0);

        ubicaciones.get(2).addExit("N",5);
        ubicaciones.get(2).addExit("Q",0);

        ubicaciones.get(3).addExit("O",1);
        ubicaciones.get(3).addExit("Q",0);

        ubicaciones.get(4).addExit("O",2);
        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("Q", 0);

        ubicaciones.get(5).addExit("S", 1);
        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("Q", 0);


    }
    public static void main(String[] args){
        Map<Integer, Ubicacion> ubicaciones = new Main().ubicaciones;
        Scanner scanner = new Scanner(System.in);
        int opciones = 1;
        String opcion ="";
        while (!opcion.equalsIgnoreCase("Q")){
            try {
                System.out.println(ubicaciones.get(opciones).getDescripcion());

                for (Map.Entry<Integer, Ubicacion> ubicacionEntry : ubicaciones.entrySet()){
                    if (ubicacionEntry.getValue().getId() == opciones){
                        System.out.println(ubicacionEntry.getValue().getExits());
                        System.out.println("Introduce una opcion valida: ");
                        opcion = scanner.nextLine();

                        opciones = ubicacionEntry.getValue().getExits().get(opcion);
                        System.out.println(opciones);
                        break;
                    }
                }

            }catch (NullPointerException a){
                System.out.println("La opcion introducida no es valida: ");
            }
        }

        System.out.println(ubicaciones.get(0).getDescripcion());
    }
}
