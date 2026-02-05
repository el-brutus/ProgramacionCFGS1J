package UT5Hoja5;

public class SalaryEmployee extends Employee{
    public int cobro;
    public SalaryEmployee(String nombre, String cargo, int cobro) {
        super(nombre, cargo);
        this.cobro=cobro;
    }

    @Override
    public int calculateWeeklyPay() {
        return cobro;
    }

}
