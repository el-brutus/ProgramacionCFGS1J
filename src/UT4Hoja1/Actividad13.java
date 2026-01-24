package UT4Hoja1;
import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args){
        System.out.println("Introduce 1 para entrar al programa");
        Scanner scanner = new Scanner(System.in);
        int opcion= scanner.nextInt();
        int[] array1 = null;
        while (opcion == 1) {
            System.out.println("Introduce que programa quieres iniciar: ");
            System.out.println("Introduce 1 para crear un array");
            System.out.println("Introduce 2 para mostar el array creado");
            System.out.println("Introduce 3 para transformar ese array");
            System.out.println("Introduce otro numero para salir");
            int programa = scanner.nextInt();
            switch (programa) {

                case 1 -> {

                     array1 = Arraytester.leerEnteros();
                }


                case 2 ->{
                    Arraytester.imprimirArray(array1);
                }

                case 3 ->{
                    Arraytester.transformarArray(array1);
                }

                default ->{
                    System.out.println("Saliendo del programa");
                    opcion =0;
                }
            }
        }
    }
}
