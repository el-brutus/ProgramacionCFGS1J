package UT5Hoja6;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
      boolean salida=false;
      Scanner scanner = new Scanner(System.in);
      TelefonoMovil telefono = new TelefonoMovil("623112323");
    while (salida = false){
        System.out.println("Introduce una opcion:");
        int opcion;
        opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 0:
                System.out.println("Saliendo del programa");
                salida = true;
                break;
            case 1:
                telefono.printContacts();
                break;
            case 2:
                System.out.println("Introduce el nombre del contacto");
                String nombre;
                nombre = scanner.nextLine();
                System.out.println("Introduce el numero");
                String numero = scanner.nextLine();
                Contacto contactonuevo = Contacto.createContact(nombre, numero);
                telefono.addNewContact(contactonuevo);
                break;
            case 3:
                System.out.println("Introduce el nombre del contacto a actualizar: ");
                String nombreantiguo = scanner.nextLine();
                if (telefono.queryContact(nombreantiguo)!=null){
                    System.out.println("Introduce el nuevo nombre para ese contacto: ");
                    String nombrenuevo = scanner.nextLine();
                    Contacto contactoviejo = telefono.queryContact(nombreantiguo);
                    System.out.println("Introduce el numero del contacto");
                    String nuevonumero = scanner.nextLine();
                    Contacto contactonuevoact = new Contacto(nombrenuevo,nuevonumero);
                    telefono.updateContact(contactoviejo,contactonuevoact);
                    break;
                } else {
                    break;
                }

            case 4:
        }
    }
    }
}
