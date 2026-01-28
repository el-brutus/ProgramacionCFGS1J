package UT5Hoja2;

public class MainEncapsulacion {
    public static void main(String[] args) {
        Impresora impresora = new Impresora(80, true);
        System.out.println("Nivel de toner: "+ impresora.settoner(20));
        System.out.println("Numero de paginas a imprimir: "+ impresora.imprimir(7));
        System.out.println("Paginas imprimidas: " + impresora.getPaginasimprimidas());
        }

}
