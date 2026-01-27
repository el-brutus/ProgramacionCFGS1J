package UT5Hoja2;

public class Impresora {
    private int nivel_toner;
    private int numpaginas;
    private boolean impresiondoblecara;

    public int cantidadtonel(int nivel_toner, int cantmaxima){
    if (nivel_toner > cantmaxima || nivel_toner < 0){
        return -1;
    }
    return nivel_toner;
    }
}
