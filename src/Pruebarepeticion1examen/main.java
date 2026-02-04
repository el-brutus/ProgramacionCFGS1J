package Pruebarepeticion1examen;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int valormenu = -1;
        Scanner scanner= new Scanner(System.in);
        comprobarip comprobador = new comprobarip();
        while (valormenu != 0) {

            System.out.println("Introduce 1 para comprobar una IP o 0 para finalizar:");
            valormenu = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            if (valormenu == 1) {
                System.out.println("Introduce una IP:");
                String ip = scanner.nextLine();

                if (comprobador.mascara(ip)) {
                    System.out.println("La ip es valida");
                } else {
                    System.out.println("la ip no es valida");
                }

            }
        }

        System.out.println("Saliendo del programa");
        scanner.close();
    }
}
