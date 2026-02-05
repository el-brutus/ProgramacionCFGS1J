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
    }
}
