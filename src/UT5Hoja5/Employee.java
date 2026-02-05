package UT5Hoja5;

public abstract class Employee {
    protected String nombre;
    protected String cargo;

    public Employee(String nombre, String cargo){
        this.nombre = nombre;
        this.cargo=cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract int calculateWeeklyPay();
}
