package vuelos;

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

    public VUELO(String nvuelo, String origen, String destino, String dia, clase tipoclase) {
        this.nvuelo = nvuelo;
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.tipoclase = tipoclase;
    }
    @Override
    public String toString(){
        return "Numero: "+this.nvuelo +", orgigen: "+origen+", destino:"+destino
                +", dia: "+ dia+", clase: "+tipoclase;
    }
}
