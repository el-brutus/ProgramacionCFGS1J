package UT3Hoja2;

public class terreno {
    private double ancho;
    private double largo;
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getAncho() {
        if (ancho < 0){
            ancho = 0;
        }
        return ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getLargo() {
        if (largo < 0 ){
            largo=0;
        }
        return largo;
    }


    public double getArea(){
        double area;
        area = ancho*largo;
        return area;
    }
}
