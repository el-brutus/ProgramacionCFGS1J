package UT3Hoja1;

public class Persona {
    private String Nombre;
    private  String Apellido;
    private int Edad;
    public Persona(){
        this.Apellido="";
        this.Nombre="";
        this.Edad=0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        if (Edad>100||Edad<0) {
            Edad=0;
        }

        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
    public String esAdolescente(){
        String esAdolescente;
        if (Edad > 12 && Edad < 20 ){
            esAdolescente="Verdadero";
        } else {
            esAdolescente="Falso";
        }
        return esAdolescente;
    }
    public String getFullName(){
        String FullName;
        FullName = Nombre + " " + Apellido;
        return FullName;
    }
}
