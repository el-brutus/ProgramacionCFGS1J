package Pruebarepeticion1examen;

public class comprobarip {

    public static boolean ipvalida(String ip){

        String[] partes = ip.split("\\.");

        if (partes.length != 4){
            return false;
        }

        for (String parte : partes){
            if (parte.isEmpty()){
                return false;
            }

            for ( int i = 0 ;i < parte.length();i++){
                if(!Character.isDigit(parte.charAt(i))){
                    return false;
                }

                int numero = Integer.parseInt(parte);

                if(numero < 0||numero > 255){
                    return false;
                }
                if (parte.length() > 1 && parte.startsWith("0")){
                    return false;
                }
            }
        }
        return true;
    }
    public String mascara(String ip){
        String[] partes = ip.split("/");

        if (partes.length != 2){
            return "Formato incorrecto";
        }

        String ipvalidada = partes[0];
        String mascaras = partes[1];
        if (!ipvalida(ip)){
            return "Ip no valida";
        }

        if(mascaras.isEmpty()){
            return "Mascara esta vacia";
        }

        for (int i = 0; i < mascaras.length(); i++) {
            if (!Character.isDigit(mascaras.charAt(i))) {
                return "Mascara fuera de rango";
            }
        }

        int valormascara = Integer.parseInt(mascaras);

        if (valormascara >=0&& valormascara<=9){
            return "Sin calse";
        }
        if (valormascara >=10&& valormascara<=126){
            return "Clase A";
        }
        if (valormascara == 127){
            return "Sin calse";
        }
        if (valormascara >=128&& valormascara<=191){
            return "Clase B";
        }
        if (valormascara >=192&& valormascara<=223){
            return "Clase C";
        }
        if (valormascara >=224&& valormascara<=239){
            return "Clase D";
        }
        if (valormascara >=240&& valormascara<=255){
            return "Sin calse";
        }
        return "Valor no valido";
    }
}
