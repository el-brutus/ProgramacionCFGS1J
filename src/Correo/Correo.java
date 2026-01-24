package Correo;

import java.util.Scanner;

public class Correo {
    public static void main(String[] args){
        System.out.println("Introduce tu correo electronico: ");
        Scanner scanner = new Scanner(System.in);
        String correo = scanner.nextLine();
        String patron = "^[A-Za-z][7A-Za-z0-9]*@[A-Za-z0-9]+\\.[A-Za-z]{2,}$";

        if (correo.matches(patron)){
            System.out.println("El correo "+ correo + " es valido");
        } else {
            System.out.println("El correo " + correo + " no es valido");
        }
        scanner.close();
    }
}
