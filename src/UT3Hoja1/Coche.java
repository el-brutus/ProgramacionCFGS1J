package UT3Hoja1;

public class Coche {
        private int Puertas;
        private double peso;
        private double precio;
        private String motor;
        private String modelo;
        private String color;
        private String marca;

        public Coche(){
            this.marca="";
            this.color="";
            this.modelo="";
            this.motor="";
            this.precio=0;
            this.peso=0;
            this.Puertas=0;
        }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int puertas) {
        Puertas = puertas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

