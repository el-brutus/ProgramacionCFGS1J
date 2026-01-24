package Hoja8;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Actividad6y7 {
    public static void main(String[] args) {
       for (int k = 0;k< 5;k++){
           if (k==0)
               throw new ArithmeticException(k + " está fuera de rango");
           System.out.println(100 / k);
           }
       //El error esta al hacer el sout ya que no se puede dividir entre 0
        // El trazo de pila del error es: Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Hoja8.Actividad6.main(Actividad6.java:8)
    }
}