package Examen2;

public class Reserva extends Habitacion{
    private int noches;
    private double preciofinal;
    private int numhab= getNumero();
    private complemento tipcom=getTipocom();
    private tipo tiphab=getTipohab();
    public Reserva(String dni, int numero, int noches) {
        this.noches = noches;
        setNumero(numero);
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public int getNumhab() {
        return numhab;
    }

    public void setNumhab(int numhab) {
        this.numhab = numhab;
    }

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    private double calcularPrecio(int noches){
        return calcularprecio(noches);
    }

    @Override
    public String toString(){
        return STR."Numero hab: \{getNumero()}, Tipo: \{tipohab}, Complemento: \{}";
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
