package UT3Hoja3;

public class Actividad1 {
    public static void main(String[] args){
        MinutosSegundos segundos = new MinutosSegundos();
        /*System.out.println("Estos son los segundos: " + segundos.getSegundos(61));
        System.out.println("Estos son los minutos: " + segundos.getMinutos(60));
*/        System.out.println(MinutosSegundos.obtenerMensajeDuracion(121,58));
        System.out.println(MinutosSegundos.obtenerMensajeDuracion(3601));
    }
}
