package Examen2;

public class Habitacion implements RESERVABLE{
    protected int numero;
    protected double precionoche=66.50;
    protected boolean ocupada=false;

    public Habitacion() {
    }


    public enum tipo{
        SIMPLE,
        DOBLE
    }
    protected tipo tipohab;
    protected boolean vistas;
    protected boolean minibar;
    public enum complemento{
        VISTAS,
        MINIBAR
    }
    protected complemento tipocom;
    protected Habitacion(int numero, tipo tipohab, boolean complemento) {
        this.numero = numero;
        this.tipohab = tipohab;

        if (tipohab.equals(tipo.DOBLE)){
            if (complemento==true) {
                tipocom = Habitacion.complemento.VISTAS;
            }
        }
        if (tipohab.equals(tipo.SIMPLE)){
            if (complemento==true){
                tipocom = Habitacion.complemento.MINIBAR;
            }
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecionoche() {
        return precionoche;
    }

    public void setPrecionoche(double precionoche) {
        this.precionoche = precionoche;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public tipo getTipohab() {
        return tipohab;
    }

    public void setTipohab(tipo tipohab) {
        this.tipohab = tipohab;
    }

    public boolean isVistas() {
        return vistas;
    }

    public void setVistas(boolean vistas) {
        this.vistas = vistas;
    }

    public boolean isMinibar() {
        return minibar;
    }

    public void setMinibar(boolean minibar) {
        this.minibar = minibar;
    }

    public complemento getTipocom() {
        return tipocom;
    }

    protected double calcularprecio(int noches){
        double precio;
        if (tipohab==tipo.DOBLE&&vistas==true){
            return precio =  noches * (precionoche + 5);
        }
        return precio = noches * precionoche;
    }
    @Override
    public String toString(){
       return "Numero: "+numero+", Tipo: " + tipohab+ ", complemento: "+tipocom;
    }
    @Override
    public boolean reservar(int noches) {
        return false;
    }

    @Override
    public boolean cancelar() {
        return false;
    }
}


