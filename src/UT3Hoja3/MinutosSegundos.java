package UT3Hoja3;

public class MinutosSegundos {

    public static String obtenerMensajeDuracion(int minutos, int segundos){
        int horas = 0;
        /*if (minutos >59){
            minutos=0;

        } if (segundos > 59){
            segundos=0;
            minutos++;
        }
        */horas= minutos /60;
        minutos = minutos%60;
        return horas+"h,"+minutos+"m,"+segundos+"s";


    }
    public static String obtenerMensajeDuracion(int segundos){
        int minutos=0;
        if (segundos >=0){
            minutos=segundos/60;
            segundos= segundos%60;
            return obtenerMensajeDuracion(minutos, segundos);
        }else {
            return "Valor invalido";
        }


    }


    public static String getSegundos(int segundos) {
        String segundosstr = "";
        if (segundos < 0 || segundos > 59){

            segundosstr = String.valueOf(segundos);
            segundosstr = "Segundos invalidos";

        }
        return segundosstr;
    }


}
