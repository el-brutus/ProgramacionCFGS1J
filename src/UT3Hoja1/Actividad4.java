package UT3Hoja1;

public class Actividad4 {
    public static void main(String[] args) {
    hazlotu base1 = new hazlotu();
    base1.setTitulos(3);
    base1.setCentral("Sabadell");
    base1.setCiudad("Elche");
    base1.setAgenciabanco("Sabadell");
    base1.setNombre("Pepe");
    base1.setApellido("Bichuela");
    base1.setEdad(33);
        System.out.println("Esta es la cantidad de titulos que posee: " + base1.getTitulos());
        System.out.println("Esta es su central: " + base1.getCentral());
        System.out.println("Esta es la ciudad donde se localiza: " + base1.getCiudad());
        System.out.println("Esta es su agencia: " + base1.getAgenciabanco());
        System.out.println("Este es su nombre: " + base1.getNombre());
        System.out.println("Este es su apellido: " + base1.getApellido());
        System.out.println("Este es su nombre completo: " + base1.getnombrecompleto());
        System.out.println("Esta es su edad: " + base1.getEdad());
    }
}