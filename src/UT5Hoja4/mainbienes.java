package UT5Hoja4;

public class mainbienes {
    public static void main(String[] args){
        Bienes b = new Bienes("Camisa", 10);
        Comida c = new Comida("Cochinillo", 2.52);
        Juguete j = new Juguete("Pelota", 15, 10);
        Libro l = new Libro("Aprender a caminar", 15, "Paco");

        System.out.println(b);
        System.out.println(c);
        System.out.println(j);
        System.out.println(l);

        Bienes[] bienes2 = {
                new Bienes("Camiseta", 20),
                new Comida("Cochinillo", 30),
                new Juguete("RC-XD", 30, 18),
                new Libro("Como respirar", 12, "Pepe")
        };

        System.out.println("Bienes array: " + bienes2[1]);

            System.out.println(bienes2[2].toString());

        }
}
