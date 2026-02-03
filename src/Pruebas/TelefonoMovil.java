package Pruebas;

public class TelefonoMovil implements Impuesto {
    private int minumero;
    private boolean estaSonando;

    public TelefonoMovil(int minumero){
        this.minumero = minumero;
    }

    @Override
    public double calcular() {
        return TASA_DE_IMPUESTO * 12;
    }

    @Override
    public void imprimirImpuesto() {
        System.out.println("El impuesto anual del teléfono es " + calcular());
    }
}
