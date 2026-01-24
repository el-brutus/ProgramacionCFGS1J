package UT3Hoja3;

public class Figura {
    public static double area(double radio){
        double area=0;
        if (radio < 0){
            radio = -1.0;
            area = radio;
        }else{
            area= 3.14*(radio*radio);
        }
        return area;
    }
    public static double area(double x, double y){
        double area;
        if (x < 0 || y < 0){
            area = -1.0;

        }else{
            area =x * y;
        }

        return area;
    }
    public static double area(double B, double b, double h){
        double area;
        if (B < 0 || b < 0 || h < 0){
            area = -1.0;

        }else{
            area =((B+b)/2)*h;
        }
        return area;
    }
}
