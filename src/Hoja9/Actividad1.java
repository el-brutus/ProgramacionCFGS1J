package Hoja9;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Actividad1 {
    public static int voltea(int num) {
        String numerostr = String.valueOf(num);
        String numeroinver = new StringBuilder(numerostr).reverse().toString();

        return Integer.parseInt(numeroinver);
    }
    public static boolean esCapicua(int numero) {
        int numerovolteado;
        numerovolteado = voltea(numero);
        boolean esCapicua = false;
        if (numero == numerovolteado) esCapicua = true;
        return esCapicua;
    }
    public static boolean esPrimo(int num){
        int numeroprimo = num;
        boolean esPrimo = false;
        if (numeroprimo % 2 != 0)esPrimo = true;
        return esPrimo;
    }
    public static int siguientePrimo(int numero) {
        numero++;
        while (!esPrimo(numero)) {
            numero++;
        }
        return numero;
    }
    public static int potencia(int num, int exponente){
        int numerobase = 1;
        for (int contador=0 ;contador < exponente;contador++){
            numerobase = num * numerobase;

        }
        return numerobase;
    }

    public static int digitos(int num){
        String longitud = String.valueOf(num);
        int numerolong = longitud.length();
        return numerolong;
    }
    public static int digitoN(int numero, int posicion){
        String numerostr = String.valueOf(numero);
        if (posicion < 0 || posicion >= numerostr.length()){
            System.out.println("La posicion esta fuera de rango");
        }
        char posicionnum = numerostr.charAt(posicion);
        return Character.getNumericValue(posicionnum);
    }
    public static int posicionDeDigito(int numero, int ocurrencia){

        String numerostr = String.valueOf(numero);
        String ocurrenciastr = String.valueOf(ocurrencia);
        int ocurrenciafinal = numerostr.indexOf(ocurrenciastr);

        return ocurrenciafinal;
    }
    public static int quitaPorDetras(int numero, int quitaratras){
        for (int contador = 0; contador < quitaratras; contador++) {
            numero = numero / 10;
        }
        return numero;
    }
    public static int quitaPorDelante(int numero, int quitardelante){
        String numerostr = String.valueOf(numero);
        String resultadostr = numerostr.substring(quitardelante);
        return Integer.parseInt(resultadostr);
    }
    public static int pegaPorDetras(int numero1, int numeroañadido){
        String numerospegados = String.valueOf(numero1) + String.valueOf(numeroañadido);
        return Integer.parseInt(numerospegados);
    }
    public static int pegaPorDelante(int numero1, int numeroañadido){
        String numero1delante = String.valueOf(numero1);
        String numeroañadido1 = String.valueOf(numeroañadido);
        String numerodigitodelante = numeroañadido1 + numero1delante;
        return Integer.parseInt(numerodigitodelante);
    }

    public static int trozoDeNumero(int numero, int posicionin, int posicionfin){

        for (int contador = 0; contador < posicionfin; contador++) {
            numero = numero / 10;

        }
        String numerostr = String.valueOf(numero);
        String resultadostr = numerostr.substring(posicionin);
        //System.out.println(resultadostr + " y " + numero );
        //String resultadofinal = numero + resultadostr;
        return Integer.parseInt(resultadostr);
    }

    public static int juntaNumeros(int numero1, int numero2){
        String numerosjuntos = String.valueOf(numero1) + String.valueOf(numero2);
        return Integer.parseInt(numerosjuntos);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccion = -1;

        while (eleccion != 0) {
            System.out.println("-------------------------------------------");
            System.out.println("         Selecciona una opcion             ");
            System.out.println("1 Para ver si el numero es capicua");
            System.out.println("2 Para ver si el numero es primo");
            System.out.println("3 Para ver si el siguiente primo del anteior");
            System.out.println("4 Para ver ver una potencia de un numero");
            System.out.println("5 Para ver la longitud de un numero");
            System.out.println("6 Para ver un numero dado la vuelta");
            System.out.println("7 Para ver un digito en la posicion señalada");
            System.out.println("8 Para ver la posicion de un numero");
            System.out.println("9 Para quitar un numero por detras");
            System.out.println("10 Para quitar un numero por delante");
            System.out.println("11 Para añadir un numero por detras");
            System.out.println("12 Para añadir un numero por delante");
            System.out.println("13 Para devolver el numero sin los valores finales ni iniciales");
            System.out.println("14 Para juntar numeros");
            System.out.println("0 Para salir del programa");
            System.out.println("-------------------------------------------");
            System.out.print("Introduzca su eleccion: ");
            try {
                eleccion = scanner.nextInt();

                switch (eleccion) {
                case 1 -> {
                    int numerocapicua;
                    System.out.println("Introduce un numero para ver si es capicua");
                    numerocapicua = scanner.nextInt();
                    //Ver si es capicua
                    System.out.println(numerocapicua + " es capicua? " + esCapicua(numerocapicua));

                }

                case 2 -> {

                    int numeroprimo;
                    System.out.println("Introduce un numero para comprobar si es primo: ");
                    numeroprimo = scanner.nextInt();
                    //Comprobar si es primo
                    System.out.println(numeroprimo + " es primo? " + esPrimo(numeroprimo));

                }
                case 3 -> {
                    int numeroprimo;
                    System.out.println("Introduce un numero para ver el siguiente primo: ");
                    numeroprimo = scanner.nextInt();
                    //Siguiente primo
                    System.out.println("Este es el siguiente numero primo de " + numeroprimo + ": " + siguientePrimo(numeroprimo));

                }
                case 4 -> {
                    int numeropotencia;
                    int exponente;
                    System.out.println("Introduce un numero: ");
                    numeropotencia = scanner.nextInt();
                    System.out.println("Introduce un numero para elevar al otro: ");
                    exponente = scanner.nextInt();
                    //Potencias
                    System.out.println(potencia(numeropotencia, exponente));
                }
                case 5 -> {
                    //Longitud numero
                    int numerolong;
                    System.out.print("Introduce un numero para comprobar su longitud: ");
                    numerolong = scanner.nextInt();

                    System.out.print("El numero " + numerolong + " tiene una longitud de " + digitos(numerolong));
                }
                case 6 -> {
                    //Voltea
                    int numerovoltea;
                    System.out.print("Introduce un numero para darle la vuelta: ");
                    numerovoltea = scanner.nextInt();
                    System.out.println("Este es en numero " + numerovoltea + " dado la vuelta " + voltea(numerovoltea));
                }
                case 7 -> {
                    //Posicion numero digitoN
                    int numerolong;
                    System.out.print("Introduce un numero para sacer que numero hay en x posicion: ");
                    numerolong = scanner.nextInt();
                    int posicion;
                    System.out.print("Introduce la posicion: ");
                    posicion = scanner.nextInt();
                    System.out.println(digitoN(numerolong, posicion));
                }
                case 8 -> {
                    //posicionDeDigito
                    int numerodigito;
                    System.out.print("Introduce un numero para ver la ocurrencia: ");
                    numerodigito = scanner.nextInt();

                    int ocurrencia;
                    System.out.print("Introduce la ocurrencia: ");
                    ocurrencia = scanner.nextInt();
                    System.out.println("Esta es la ocurrencia nº " + ocurrencia + " del numero: " + numerodigito + " = " + posicionDeDigito(numerodigito, ocurrencia));
                }
                case 9 -> {
                    //Quitar detras
                    int numerodetras;
                    System.out.print("Introduce un numero: ");
                    numerodetras = scanner.nextInt();
                    int quitardetras;
                    System.out.print("Introduce la cantidad de caracteres que quitar por detras: ");
                    quitardetras = scanner.nextInt();
                    System.out.println("Numero con los numeros quitados por atras: " + quitaPorDetras(numerodetras, quitardetras));
                }
                case 10 -> {
                    //Quitar delante
                    int numerodelante;
                    System.out.print("Introduce un numero: ");
                    numerodelante = scanner.nextInt();
                    int quitardelante;
                    System.out.print("Introduce cuantos numeros deseas quitar por delante");
                    quitardelante = scanner.nextInt();
                    System.out.println("Numero con los numeros quitados por delante: " + quitaPorDelante(numerodelante, quitardelante));
                }
                case 11 -> {
                    //Añadir numero detras
                    int numero1detras;
                    System.out.print("Introduce un numero para añadir otro detras:");
                    numero1detras = scanner.nextInt();
                    int numeroañadidodetras;
                    System.out.print("Introduce otro numero para añadir detras");
                    numeroañadidodetras = scanner.nextInt();
                    System.out.println("El numero 1 con el digito añadido detras es este: " + pegaPorDetras(numero1detras, numeroañadidodetras));
                }
                case 12 -> {
                    //Añadir numero delante
                    int numero1delante;
                    System.out.print("Introduce un numero para añadir otro delante: ");
                    numero1delante = scanner.nextInt();
                    int numeroañadidodelante;
                    System.out.print("Introduce el numero que añadir delante del otro: ");
                    numeroañadidodelante = scanner.nextInt();
                    System.out.println("El numero 1 con el digito añadido delante es este: " + pegaPorDelante(numero1delante, numeroañadidodelante));
                }
                case 13 -> {
                    //trozoDeNumero
                    int trozodenumero;
                    System.out.print("Introduce un numero para recibir el trozo resultado: ");
                    trozodenumero = scanner.nextInt();
                    int posicioninicial;
                    System.out.print("Introduce la posicion inicial: ");
                    posicioninicial = scanner.nextInt();
                    int posicionfinal;
                    System.out.print("Introduce la posicon final: ");
                    posicionfinal = scanner.nextInt();
                    System.out.println(" numero con digitos quitados atras y delante: " + trozoDeNumero(trozodenumero, posicioninicial, posicionfinal));
                }
                case 14 -> {
                    //Juntar numeros
                    int numerojunto1;
                    System.out.print("Introduce el primer numero para juntar 2 numeros: ");
                    numerojunto1 = scanner.nextInt();
                    int numerojunto2;
                    System.out.print("Introduce el segundo numero para juntarlos: ");
                    numerojunto2 = scanner.nextInt();
                    System.out.println(juntaNumeros(numerojunto1, numerojunto2));
                }
            }

            }catch (InputMismatchException e){
                System.out.println("No has introducido un numero");
                scanner.nextLine();
            }
        }
    }
}
