package UT3Hoja4;

public class ActividadHoja4 {
    public static String string1(String string1, int indice){
        //String indicestr = String.valueOf(indice);
        String resultado = string1.substring(indice);
        return resultado;
    }
    public static String string2(String string2, int indice2){
        string2 = string2.valueOf(string2.codePointAt(indice2-1));
        return string2;
    }
    public static String string3(String texto1, String texto2){
        String comprobador;

        if (texto1.equalsIgnoreCase(texto2)){
            comprobador=String.valueOf(true);
        }else {
            comprobador= String.valueOf(false);
        }
        return texto1 + ", " + texto2 +" " + comprobador;
    }
    public static String string4(String letra1, String letra2){
        int comparador;
        comparador = letra1.compareTo(letra2);
        String comprobador;
        if (comparador > 0){
            comprobador= letra1 + " es mayor que " + letra2;
        } else {
            comprobador= letra1 + " es menor que " + letra2;
        }if (letra1.equalsIgnoreCase(letra2)){
            comprobador= letra1 + " es igual que " + letra2;
        }
        return comprobador;
    }
    public static String string7(String texto, String texto1){
        texto = texto.toLowerCase();
        texto1 = texto1.toLowerCase();
        String comprobador;
        if (texto.contains(texto1)){
            comprobador = true + ", lo escrito en " + texto1 + " se encuentra en " + texto;
        }else {
            comprobador = false + ", lo escrito en " + texto1 + " no se encuentra en "+ texto;
        }
        return comprobador;
    }
    public static String string8(String texto1, String texto2){
        String comprobador;
        if (texto1.startsWith(texto2)){
            comprobador = "el texto " + texto1 + " comienza con " + texto2;
        }else {
            comprobador = "el texto " + texto1 + " no comienza con " + texto2;

        }
        return comprobador;
    }
    public static String string9(String string1){
        String indice="";
        for (int i = 0;i < string1.length();i++){
            indice = String.valueOf(string1.charAt(i));
            System.out.println(indice  + " indice " + i);
        }
        return indice;
    }
    public static String string10(String texto1, char caracterviejo, char caracternuevo){
        String resultado;
        resultado = texto1.replace(caracterviejo, caracternuevo);
        return resultado;
    }
    public static String string11(String texto1, int posicion){
        String texto2 = texto1.substring(0, posicion);
        posicion++;
        String texto3 = texto1.substring(posicion);
        texto1 = texto2.concat(texto3);
        return texto1;
    }
    public static String string12(String texto1){
        StringBuilder textob = new StringBuilder(texto1);
        String textor =  textob.reverse().toString();
        return textor;
    }
    public static String string13(String texto, int posicion1, int posicion2){
        String resultado;
        resultado = texto.substring(posicion1, posicion2);
        return resultado;
    }
    public static String string14(String texto1){
        String resultado = "";

        for (int i = 0; i < texto1.length(); i++) {
            char caracter = texto1.charAt(i);
            if (resultado.indexOf(caracter) == -1) {
                resultado += caracter;
            }
        }
        return resultado;
    }
    public static char string15(String texto1){
        char caracter;
        for (int i = 0; i < texto1.length(); i++) {
            caracter = texto1.charAt(i);
            if (texto1.indexOf(caracter) == texto1.lastIndexOf(caracter)) {
                return caracter;
            }
        }
        return ' ';
    }
    public static String string16(String texto1, int partes){
        int longitud = texto1.length();
        String resultado = "";
        if (longitud % partes != 0){
            return  "El texto no es divisible entre " + partes;
        }
        int partes2 = longitud / partes;

        for (int i = 0; i < longitud; i += partes2){
            resultado += texto1.substring(i, i + partes2) + "\n";
        }

        return resultado;
    }

    public static void main(String[] args){
        System.out.println(string1("hola",3));
        System.out.println(string2("hola",3));
        System.out.println(string3("Hoy es un buen día", "Hoy está lloviendo"));
        System.out.println(string3("Hoy es un buen día", "Hoy es UN BUEN DÍA"));
        System.out.println(string4("a","A"));
        System.out.println(string7("Hola mundo", "paco"));
        System.out.println(string8("Hola mundo", "Hola"));
        System.out.println(string9("String 9: "+ "hola"));
        System.out.println("String 10: " + string10("HOLA", 'O', 'Ñ'));
        System.out.println(string11("hola", 1));
        System.out.println(string12("hola peruano"));
        System.out.println(string13("Hoy estamos a 13 grados",0, 3));
        System.out.println(string14("programacion"));
        System.out.println(string15("abbacec"));
        System.out.println(string16("abcdefghijklmnopqrst", 5));

    }
}
