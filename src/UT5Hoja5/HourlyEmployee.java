package UT5Hoja5;

public class HourlyEmployee extends Employee{
    public int horas;
    public int cobrohora;
    public HourlyEmployee(String nombre, String cargo, int horas, int cobrohora) {
        super(nombre, cargo);
        this.cobrohora=cobrohora;
        this.horas=horas;
    }

    @Override
    public int calculateWeeklyPay() {
        return cobrohora*horas;
    }
}
