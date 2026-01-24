package UT4Hoja4;

public class MesCollector {
    private int mes;
    private int anyo;
    private int diaMes;
    private int[] temperaturames;



    public MesCollector(int mes, int anyo){
    this.anyo = anyo;
    if (mes > 0 && mes <=12){
        if (mes == 1){
            this.mes = 1;
            this.diaMes=31;
        }
        if (mes == 2){
            this.mes=2;
            if ((anyo % 100 == 0) || anyo % 400 == 0){
                this.diaMes = 29;
            }else{
                this.diaMes = 28;
            }
        }
        if (mes >=3 && mes <7){
            this.diaMes = 30;
        }
        if (mes >7 && mes <=12){
            this.diaMes = 31;
        }
        this.temperaturames = new int[this.diaMes];
    }
    }
    public int gettemperatura(int dia) {
        int temperatura=0;
        if (dia < diaMes && dia > 0) {
        temperatura = temperaturames[dia];
        } else {
            temperatura = -1;
        }
        return temperatura;
    }

    public void settemperaturas(int dia, int temperatura){

        temperaturames[dia-1] = temperatura;

    }

    @Override
    public String toString() {
        String resultado = "";

        System.out.print("La temperatura del mes " + mes + " del año " + anyo + " es: [");
        for(int contador = 0;contador < temperaturames.length;contador++){

            if (temperaturames[contador] != 0) {
                System.out.print(temperaturames[contador]);
            } else {
                System.out.print("No hay datos");
            }

            if (contador < temperaturames.length -1){
                System.out.print(", ");
            }

        }
        System.out.print("]");
        return resultado;
    }

}
