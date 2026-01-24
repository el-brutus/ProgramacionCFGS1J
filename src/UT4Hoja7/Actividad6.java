package UT4Hoja7;

import java.util.Scanner;

class EntradaTelefono {
    private String nombre;
    private int numero;

    public EntradaTelefono(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

}
class GuiaTelefonica{
    private EntradaTelefono[] nombre;

    public GuiaTelefonica() {
        this.nombre = new EntradaTelefono[5];

        nombre[0] = new EntradaTelefono("Patricia Marti", 123456789);
        nombre[1] = new EntradaTelefono("Francisco", 123456789);
        nombre[2] = new EntradaTelefono("Jose Antonio", 123456789);
        nombre[3] = new EntradaTelefono("Miguel", 123456789);
        nombre[4] = new EntradaTelefono("Hernan", 123456789);
    }
    public EntradaTelefono busqueda(String nombrebuscado){
        for (EntradaTelefono resultado : nombre){
            if (resultado.getNombre().equalsIgnoreCase(nombrebuscado)){
                return  resultado;
            }
        }
        return null;
    }
}
public class Actividad6 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    GuiaTelefonica busqueda = new GuiaTelefonica();
    System.out.println("Introduce un nombre a buscar: ");
    String nombre = scanner.nextLine();

    EntradaTelefono resultado = busqueda.busqueda(nombre);
    if (resultado != null){
        System.out.println("El nombre ha sido encontrado " + resultado.getNombre() + " y " + "su telefono es: " + resultado.getNumero());
    } else {
        System.out.println("El nombre no ha sido encontrado");
    }
}
}