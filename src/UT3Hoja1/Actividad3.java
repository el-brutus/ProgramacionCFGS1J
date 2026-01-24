package UT3Hoja1;

public class Actividad3 {
    public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.setNombre("Paco");
    persona1.setApellido("Gutierrez");
    persona1.setEdad(20);
        System.out.println("Su nombre es: " + persona1.getNombre());
        System.out.println("Su apellido es: " + persona1.getApellido());
        System.out.println("Su edad es: " + persona1.getEdad());
        System.out.println("Es adolescente: " + persona1.esAdolescente());
        System.out.println("Su nombre completo es: " + persona1.getFullName());
    }
}