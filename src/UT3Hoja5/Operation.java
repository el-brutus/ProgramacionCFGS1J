package UT3Hoja5;
class Operation{
    int data=50;
    void cambiar(int data){
        this.data = data + 100;
    }
    public static void main(String args[]){
        Operation op=new Operation();
        System.out.println("antes del cambio " + op.data);
        op.cambiar(500);
        System.out.println("después " + op.data);
    }
}

