package UT3Hoja2;

public class ClienteVIP {
    private String nombre;
    private String email;
    private double limiteCredito;
    private tipoVIP tipo;
    public ClienteVIP(){
        this("Pepe", "ejemplo@corre.com", 1000, tipoVIP.NORMAL);
    }
    public ClienteVIP(String nombre, String email){
        this(nombre, email, 1000, tipoVIP.NORMAL);
    }
    public ClienteVIP(String nombre, String email, double limiteCredito, tipoVIP tipo){
        this.nombre=nombre;
        this.email=email;
        this.limiteCredito=limiteCredito;
        this.tipo= tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public tipoVIP getTipo() {
        return tipo;
    }

    public void setTipo(tipoVIP tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ClienteVIP{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", limiteCredito=" + limiteCredito +
                ", tipo=" + tipo +
                '}';
    }
}
