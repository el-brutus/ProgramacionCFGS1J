package UT3Hoja2;

public class Punto {
    private int x;
    private int y;

    public Punto(){
        this.x=0;
        this.y=0;
    }
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distancia() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }


    public double distancia(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }


    public double distancia(Punto punto) {
        return Math.sqrt((this.x - punto.x) * (this.x - punto.x) + (this.y - punto.y) * (this.y - punto.y));
    }

    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
