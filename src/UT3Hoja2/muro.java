package UT3Hoja2;

public class muro {
    private double ancho;
    private double alto;
    public muro(){
        this(5 , 4);
    }

    public muro(double ancho, double alto){
        this.ancho=ancho;
        this.alto=alto;
    }
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if(ancho < 0 ){
            ancho = 0;
        }
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;

    }

    public void setAlto(double alto) {
        if(alto < 0){
            alto = 0;
        }
        this.alto = alto;

    }
    public double getArea(){
        double area;
        area = alto * ancho;
        return area;
    }

    @Override
    public String toString() {
        return "muro{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
