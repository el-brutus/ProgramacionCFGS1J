package UT5Hoja5;

public class MainForma {
    public static void main(String[] args){
        Triangulo triangulo = new Triangulo(3,4,5);
        System.out.println(triangulo.getArea());
        System.out.println(triangulo.getPerimeter());
        Rectangulo rectangulo = new Rectangulo(4, 5 , 7);
        System.out.println(rectangulo.getArea());
        System.out.println(rectangulo.getPerimeter());

        Rectangulo rectangulo1 = new Rectangulo(4,2,3);
        System.out.println("Perimetro sin redimensionar: " + rectangulo1.getPerimeter());
        System.out.println("Area sin redimensionar: "+rectangulo1.getArea());
        rectangulo1.redimensionar(2);
        System.out.println("Area redimensionada: " + rectangulo1.getArea());
        System.out.println("Perimetro redimensionado: " + rectangulo1.getPerimeter());
        Rectangulo[] rectangulos = new Rectangulo[]{
        new Rectangulo(4, 3, 5),
        new Rectangulo(4, 2, 5),
        new Rectangulo(4, 5, 5),
        new Rectangulo(4, 3, 5),
        new Rectangulo(4, 8, 5),
        new Rectangulo(4, 9, 5),
        new Rectangulo(4, 3, 5),
        new Rectangulo(4, 2, 4),
        new Rectangulo(4, 3, 6),
        new Rectangulo(4, 3, 5),
        };
        String mensaje;
        for (int i = 0; i < 2; i++) {

            mensaje = (i == 0)
                    ? "Primer itinerario sin ordenar"
                    : "Segundo itinerario ya ordenado";

            System.out.println(mensaje);

            if (i == 1) {
                for (int a = 0; a < rectangulos.length - 1; a++) {
                    for (int b = a + 1; b < rectangulos.length; b++) {
                        if (rectangulos[a].compareTo(rectangulos[b]) > 0) {
                            Rectangulo aux = rectangulos[a];
                            rectangulos[a] = rectangulos[b];
                            rectangulos[b] = aux;
                        }
                    }
                }
            }

            for (int j = 0; j < rectangulos.length; j++) {
                System.out.println(rectangulos[j]);
            }
        }
    }
}
