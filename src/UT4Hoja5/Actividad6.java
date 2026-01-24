package UT4Hoja5;

public class Actividad6 {
    public static void main(String[] args){
       String[] array = new String[5];
       array[0] ="hola";
       for (int i = 0;i < array.length; i++){
           System.out.println("El string " + array[i] + " tiene una longitud de " +
                   array[i].length() + " caracteres.");
           //Si ejecutamos ahora mismo el codigo nos va a dar un error
           //ya que las posiciones del array estan vacias
           //si tuvieran informacion si que funcionaria correctamente
       }
    }
}
