package UT5Hoja2;

public class Impresora {
    private int nivel_toner;
    private int paginasimprimidas;
    private boolean impresiondoblecara;

    public Impresora(int nivel_toner, boolean impresiondoblecara) {
        if(nivel_toner < 0 || nivel_toner > 100)
        { this.nivel_toner = 0;
        } else{
            this.nivel_toner = nivel_toner;
        }
        this.paginasimprimidas = 0;
        this.impresiondoblecara = impresiondoblecara;
    }

    public int settoner(int cantmaxima){
    if (cantmaxima < 0 || cantmaxima > 100 || (cantmaxima+ nivel_toner) > 100){
        return -1;
    }
    nivel_toner += cantmaxima;
    return nivel_toner;
    }


    public int imprimir(int numpaginas){
    int numhojas;
    if (impresiondoblecara){
        numhojas = (numpaginas+1)/2;
    } else {
        numhojas = numpaginas;
    }
    if (numhojas > nivel_toner){
        return -1;
    }
    nivel_toner -= numhojas;
    paginasimprimidas += numpaginas;

    return numpaginas;
    }

    public int getPaginasimprimidas(){
        return paginasimprimidas;
    }
}