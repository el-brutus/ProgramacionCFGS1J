package Pruebas;

public class MainTelefono {
    public static void main(String[] args){
        TelefonoMovil telefono = new TelefonoMovil(523234242);
        telefono.imprimirImpuesto();

        Impuesto impuesto = new TelefonoMovil(1212312);
        impuesto.imprimirImpuesto();
    }
}
