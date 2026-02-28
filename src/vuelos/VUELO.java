package vuelos;

import java.util.ArrayList;

public class VUELO {
    public enum clase{
        TURISTA,
        PRIMERA
    }
    private String nvuelo;
    private String origen;
    private String destino;
    private String dia;
    private clase tipoclase;
    private ArrayList<VUELO> vuelos = new ArrayList<>();

    public VUELO(String nvuelo, String origen, String destino, String dia, clase tipoclase) {
        this.nvuelo = nvuelo;
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.tipoclase = tipoclase;
        this.vuelos = new ArrayList<>();
    }

    public String getNvuelo() {
        return nvuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDia() {
        return dia;
    }

    public String getTipoclase() {
        return tipoclase.toString();
    }

    @Override
    public String toString(){
        return "Numero: "+this.nvuelo +", orgigen: "+origen+", destino:"+destino
                +", dia: "+ dia+", clase: "+tipoclase;
    }
}
