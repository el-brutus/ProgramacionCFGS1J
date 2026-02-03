package UT5Hoja4;

public interface Imponible {
    double TASA_IMPUESTO = 0.06;

    default double calcularImpuesto(double precio) {
        return precio * TASA_IMPUESTO;
    }
}
