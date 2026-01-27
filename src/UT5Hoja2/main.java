package UT5Hoja2;

public class main {
    public static void main(String[] args) {
        Pared pared1 = new Pared("Norte");
        Pared pared2 = new Pared("Sur");
        Pared pared3 = new Pared("Este");
        Pared pared4 = new Pared("Oeste");

        Techo techo = new Techo(2, "Blanco");

        Cama cama = new Cama("Moderna", 2, 50, 1, 1);

        Lampara lampara = new Lampara("Clásica", true, 10);

        Habitacion habitacion = new Habitacion(
                "Dormitorio",
                pared1, pared2, pared3, pared4,
                techo,
                cama,
                lampara
        );
        habitacion.hacerLaCama();
        habitacion.getLampara().encender();

    }
}
