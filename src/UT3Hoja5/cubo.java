package UT3Hoja5;
class Cubo {
    int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado(){
        return lado;
    }
    public int area() {
        return (lado* lado) * 6;
    }

    public int volumen() {
        return lado * lado * lado;
    }
    void cambiar(Cubo cubo){
        cubo.lado = 20+ cubo.lado;
    }
}

