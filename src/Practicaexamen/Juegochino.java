package Practicaexamen;

import java.util.Scanner;

public class Juegochino {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion= 1;
        int victorias= 0;
        int victoriasord = 0;
        while (opcion == 1) {
            System.out.println("Introduce 1 para jugar o un numero distinto para acabar");
            opcion = scanner.nextInt();
            if(opcion != 1){
                break;
            }

            System  .out.println("Escoge tu cantidad de monedas(0 a 3) o introduce un numero mayor que 3 o menor que 0 para salir");
            int monedas = scanner.nextInt();
            if (monedas < 0){
                System.out.println("El numero de monedas es muy pequeño, introducelo otra vez");
                monedas = scanner.nextInt();
            }
            if (monedas > 3){
                System.out.println("El numero de monedas es muy grande, introducelo otra vez");
                monedas = scanner.nextInt();
            }
            System.out.println("Monedas del jugador: " + monedas);
            int monedasord = (int) (Math.random() * 4);
            int apuestaord = 0;
            while (apuestaord < monedasord){
                    apuestaord = 1 + (int) (Math.random() * 6);
                    apuestaord = apuestaord;
                }

            System.out.println("Apuesta de la maquina: " + apuestaord);
            System.out.println("Introduce tu apuesta(0 a 6)");
            int apuesta = scanner.nextInt();
            if (apuesta > 6){
                System.out.println("La apuesta es muy grande, introducela otra vez");
                apuesta = scanner.nextInt();
            }
            if (apuesta < monedas){
                System.out.println("La apuesta es menor que la cantidad de monedas, introducela otra vez");
                apuesta = scanner.nextInt();
            }
            System.out.println("Tu apuesta: " + apuesta);

            int sumacant= monedas + monedasord;
            if (apuesta != sumacant && apuestaord != sumacant){
                System.out.println("Nadie ha ganado");
                System.out.println("Victorias del jugador: " + victorias);
                System.out.println("Victorias de la maquina: " + victoriasord+ "\n");
                System.out.println("Monedas del jugador: " + monedas);
                System.out.println("Monedas de la maquina: " + monedasord);
                System.out.println("Apuesta de la maquina: " + apuestaord);
                System.out.println("Apuesta del jugador: " + apuesta);

            } if(apuesta == sumacant){
                System.out.println("El jugador ha ganado");
                victorias++;
                System.out.println("Victorias del jugador: " + victorias);
                System.out.println("Victorias de la maquina: " + victoriasord+ "\n");
                System.out.println("Monedas del jugador: " + monedas);
                System.out.println("Monedas de la maquina: " + monedasord);
                System.out.println("Apuesta de la maquina: " + apuestaord);
                System.out.println("Apuesta del jugador: " + apuesta);
            }if (apuestaord == sumacant){
                System.out.println("La maquina ha ganado");
                victoriasord++;
                System.out.println("Victorias del jugador: " + victorias);
                System.out.println("Victorias de la maquina: " + victoriasord+ "\n");
                System.out.println("Monedas del jugador: " + monedas);
                System.out.println("Monedas de la maquina: " + monedasord);
                System.out.println("Apuesta de la maquina: " + apuestaord);
                System.out.println("Apuesta del jugador: " + apuesta);
            }


        }
    }
}
