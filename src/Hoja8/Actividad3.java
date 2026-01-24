package Hoja8;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Actividad3 {
    public static void main(String[] args) {
        try {
            double d = Math.random();
            if (d > 0.95)
                throw new ArithmeticException( + d + " está fuera de rango") ;
            System.out.println("El número es " + d);
            double j = Math.random();
            if (j > 0.5)
                throw new ArithmeticException(j + " está fuera de rango") ;
            System.out.println("El número es " + j);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //Lo que nos da si da si d fuera 0,98 seria que nos imprimiria el ArithmeticException con el mensaje "d esta fuera de rango"
        //Ahora al dar el error se saltaria la otra parte del codigo y ejecutaria el catch

        //Act 5
        //Si el primer math fuera menor de lo requerido para el error nos imprimiria "el numero es 0,44"
        //y si el segundo math fuera mayor de lo requerido se imprimiria el error y se ejecutaria el catch
    }
}