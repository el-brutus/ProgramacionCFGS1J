package UT5Hoja5;

import java.util.Arrays;

public class MainEstudiantes {
    public static void main(String[] args){
        Estudiante[] estudiantes = new Estudiante[]{
                new Estudiante("Paco Sanz", 20, 165),
                new Estudiante("Pepe Bichuelas", 22, 180),
                new Estudiante("Jose Antonio", 19, 165),
                new Estudiante("Ramon Linares", 21, 180),
                new Estudiante("Pascual Perimetro", 20, 170)
        };
        String mensaje;
        for (int i = 0; i < 2; i++) {

            mensaje = (i == 0)
                    ? "Estudiantes sin ordenar"
                    : "Estudiantes ya ordenados";

            System.out.println(mensaje);

            if (i == 1) {
                for (int a = 0; a < estudiantes.length - 1; a++) {
                    for (int b = a + 1; b < estudiantes.length; b++) {
                        if (estudiantes[a].compareTo(estudiantes[b]) > 0) {
                            Estudiante aux = estudiantes[a];
                            estudiantes[a] = estudiantes[b];
                            estudiantes[b] = aux;
                        }
                    }
                }
            }
            for (int j = 0; j < estudiantes.length; j++) {
                System.out.println(estudiantes[j]);
            }
        }
    }
}
