package UT3Hoja1;

public class Calculadora {
    private double primerNumero;
    private double segundoNumero;

    public Calculadora() {
        this.primerNumero = 0;
        this.segundoNumero = 0;

    }

    public double getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double getResultadoSuma(){
        double ResultadoSuma;
        ResultadoSuma = primerNumero+segundoNumero;
        return ResultadoSuma;
    }
    public double getResultadoResta(){
        double ResultadoResta;
        ResultadoResta = primerNumero-segundoNumero;
        return ResultadoResta;
    }
    public double getResultadoMult(){
        double ResultadoMult;
        ResultadoMult = primerNumero*segundoNumero;
        return ResultadoMult;
    }
    public double getResultadoDiv(){
        double ResultadoDiv;
        ResultadoDiv = primerNumero/segundoNumero;
        if (segundoNumero==0){
            ResultadoDiv = segundoNumero;
        }
        return ResultadoDiv;
    }
}
