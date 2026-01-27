package UT5Hoja2;

public class Lampara {
    private String estilo;
    private boolean bateria;
    private int calificacion;


    public Lampara(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }

    public boolean encender(){
        boolean encendida= Boolean.parseBoolean("La lampara esta encendida");
    return encendida;
    }
    public String getEstilo(){
        return estilo;
    }

    public boolean hayBateria(){
        return bateria;
    }
    public int getCalificacion(){
        return calificacion;
    }

}


