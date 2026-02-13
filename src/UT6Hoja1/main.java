package UT6Hoja1;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
        private static TelefonoMovil telefono = new TelefonoMovil("600123456");

        public static void main(String[] args) {

            boolean salir = false;
            mostrarMenu();

            while (!salir) {

                System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer

                switch (opcion) {

                    case 0:
                        System.out.println("Saliendo del programa");
                        salir = true;
                        break;

                    case 1:
                        telefono.printContacts();
                        break;

                    case 2:
                        agregarContacto();
                        break;

                    case 3:
                        actualizarContacto();
                        break;

                    case 4:
                        eliminarContacto();
                        break;

                    case 5:
                        buscarContacto();
                        break;

                    case 6:
                        mostrarMenu();
                        break;

                    default:
                        System.out.println("Opcion no valida.");
                }
            }
        }

        private static void mostrarMenu() {
            System.out.println("----- MENÚ -----");
            System.out.println("0 Salir");
            System.out.println("1 Imprimir contactos");
            System.out.println("2 Agregar nuevo contacto");
            System.out.println("3 Actualizar contacto existente");
            System.out.println("4 Eliminar contacto");
            System.out.println("5 Buscar contacto por nombre");
            System.out.println("6 Volver a mostrar menu");
        }

        private static void agregarContacto() {
            System.out.print("Introduce el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce el numero de telefono: ");
            String numero = scanner.nextLine();

            Contacto contactonuevo = Contacto.createContact(nombre, numero);

            if (telefono.addNewContact(contactonuevo)) {
                System.out.println("Contacto añadido");
            } else {
                System.out.println("El contacto ya existe.");
            }
        }

        private static void actualizarContacto() {
            System.out.print("Nombre del contacto a actualizar: ");
            String nombre = scanner.nextLine();

            Contacto contactoantiguo = telefono.queryContact(nombre);

            if (contactoantiguo == null) {
                System.out.println("Contacto no encontrado.");
                return;
            }

            System.out.print("Nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();

            System.out.print("Nuevo teléfono: ");
            String nuevoTelefono = scanner.nextLine();

            Contacto contactonuevo = Contacto.createContact(nuevoNombre, nuevoTelefono);

            if (telefono.updateContact(contactoantiguo, contactonuevo)) {
                System.out.println("Contacto actualizado correctamente.");
            } else {
                System.out.println("No se pudo actualizar el contacto.");
            }
        }

        private static void eliminarContacto() {
            System.out.print("Nombre del contacto a eliminar: ");
            String nombre = scanner.nextLine();

            Contacto eliminar = telefono.queryContact(nombre);

            if (eliminar == null) {
                System.out.println("Contacto no encontrado.");
            } else {
                telefono.removeContact(eliminar);
                System.out.println("Contacto eliminado correctamente.");
            }
        }

        private static void buscarContacto() {
            System.out.print("Nombre del contacto a buscar: ");
            String nombre = scanner.nextLine();

            Contacto contactoencontrado = telefono.queryContact(nombre);

            if (contactoencontrado == null) {
                System.out.println("Contacto no encontrado.");
            } else {
                System.out.println("Nombre: " + contactoencontrado.getName());
                System.out.println("Teléfono: " + contactoencontrado.getPhoneNumber());
            }

    }
}