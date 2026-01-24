package UT4Hoja5;

public class Actividades {
    public static class Asignatura{
        private String Asignatura;
        public Asignatura(String Nombre){
            this.Asignatura = Nombre;
        }

    }

    public static void main(String[] args){
        /*
        * Actividad 1
        * Para almacenar 1000 celdas de texto diferente
        * debemos hacer un array de objetos para ello podriamos hacer
        * un bucle en el cual se le asigen posiciones de manera continuada a los strings/ textos
        */
        Asignatura[] dam1k = new Asignatura[1000];
        dam1k[0] = new Asignatura("Programacion");
        /*
        * Actividad 3
        * No todos los arrays tienen que tener la misma longitud ya que el array guarda direcciones de memoria y no especifica que tena que ser de una longitud maxima
        * Actividad 4*/
        dam1k[999] = new Asignatura("Java");
        /*
        * Actividad 5
        * Se inicializa con el valor null ya que al no tener valor no serviria que fuera 0 o "" ya que el 0 es el valor "vacio"
        * en los arrays tipo int y el "" si que seria un valor asi que null representa valores vacios en el array string
        * */
    }
}
