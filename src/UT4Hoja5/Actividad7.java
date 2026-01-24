package UT4Hoja5;

public class Actividad7 {
    public static void main(String[] args){
        String[] array = new String[5];
        array[0] = "Pera";
        array[1] = "Manzana";
        for (int i = 0;i<array.length;i++){
            if (array[i] != null){
                System.out.println("La posicion " + i + " tiene el valor: " + array[i]);
            }else{
                System.out.println("Celda " + i + " vacia");
            }
        }
    }
}
