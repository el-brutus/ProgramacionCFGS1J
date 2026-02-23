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


        int lugar = 1;


        while(lugar!=0){
            System.out.println(ubicaciones.get(lugar).getDescripcion());

            System.out.println("Estas son las direcciones validas: ");
            for (String opcion: ubicaciones.get(lugar).getExits().keySet()){
                System.out.print(opcion + " | ");
            }
            System.out.println();
            System.out.println("Introduce una direccion: ");
            String opcion = scanner.nextLine();
            opcion= opcion.toUpperCase();
            if (ubicaciones.get(lugar).getExits().containsKey(opcion)){
                lugar = ubicaciones.get(lugar).getExits().get(opcion);
            } else{
                System.out.println("La direccion introducida no es valida");
            }
            if (opcion.equals("Q")){
                System.out.println("Saliendo del programa....");
                System.out.println(ubicaciones.get(0).getDescripcion());
                lugar=0;
            }
        }



    }
}
