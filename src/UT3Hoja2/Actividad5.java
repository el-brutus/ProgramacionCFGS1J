package UT3Hoja2;

public class Actividad5 {
    public static void main(String[] args){
    casa casa = new casa();
    casa.setDireccion("Calle de los polvos nº 1");
    casa.setAño(1999);
    terreno terreno = new terreno();
    terreno.setAncho(50);
    terreno.setLargo(10);
    tipohabitacion tipohabitacion1 = tipohabitacion.habitacion;
    tipohabitacion tipohabitacion2 = tipohabitacion.baño;
        System.out.println("Esta es la direccion de su casa" + casa.getDireccion());
        System.out.println("Este es el año en el que se hizo la casa/ hace cuanto se hizo: " + casa.getAño());
        System.out.println("Este es el area de su casa: " + terreno.getArea());
        System.out.println("Este es el tipo de habitacion: " + tipohabitacion1);
        System.out.println("Este es el tipo 2 de habitacion: " + tipohabitacion2);

    }
}
