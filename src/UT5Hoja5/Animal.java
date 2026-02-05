package UT5Hoja5;

public abstract class Animal {
    protected String nombre;
    public Animal(String nombre){
        this.nombre = nombre;
        System.out.println("Este es un contructor de clase abstracta");
    }

    public abstract String abstract_method();
    public String method(){
        return "Este es un método normal de una clase abstracta";
    }
}
