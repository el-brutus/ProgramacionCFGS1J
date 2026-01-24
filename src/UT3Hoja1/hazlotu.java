package UT3Hoja1;

public class hazlotu {
    private int titulos;
    private String central;
    private String ciudad;
    private String agenciabanco;
    private String nombre;
    private String apellido;
    private int edad;
    public hazlotu(){
        this.titulos=0;
        this.central="";
        this.ciudad="";
        this.agenciabanco="";
        this.nombre="";
        this.apellido="";
        this.edad=0;

    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public String getCentral() {
        return central;
    }

    public void setCentral(String central) {
        this.central = central;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAgenciabanco() {
        return agenciabanco;
    }

    public void setAgenciabanco(String agenciabanco) {
        this.agenciabanco = agenciabanco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getnombrecompleto(){
        String nombrecompleto;
        nombrecompleto = nombre + " " + apellido;
        return nombrecompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
