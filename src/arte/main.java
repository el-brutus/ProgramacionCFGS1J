package arte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Obra> obras = new ArrayList<>();
    private static ArrayList<Artista> artistas = new ArrayList<>();
    public static void main(){
        boolean salida=false;
        while (!salida){
            imprimirmenu();
            System.out.print("Introduce una opcion: ");
            int opcion = sc.nextInt();
            Obra obra=new Obra("escultura", Obra.tipo.ESCULTURA,1500,1800,"Pablo");
            Obra obra2=new Obra("escultura", Obra.tipo.ESCULTURA,15,2020,"Pablo");
            Obra obra3=new Obra("escultura", Obra.tipo.ESCULTURA,1600,1600,"Pablo");

            obras.add(obra);
            obras.add(obra2);
            obras.add(obra3);
            Artista artista=new Artista("Pablo","spain");
            artistas.add(artista);
            switch (opcion){

                case 1:
                    addobra();
                    break;
                case 2:
                    addartista();
                    break;
                case 3:
                    buscarobra();
                    break;
                case 4:
                    buscarartista();
                    break;
                case 5:
                    eliminarobra();
                    break;
                case 6:
                    obrabarata();
                    break;
                case 7:
                    moderna();
                    break;
                case 8:
                    salida=true;
                    break;
                default:
                    System.out.println("Esa no es una opcion valida. ");
                    break;
            }
        }
    }

    public static void imprimirmenu(){
        System.out.println("-------------");
        System.out.println("1 Añadir obra");
        System.out.println("2 Añadir artista");
        System.out.println("3 Buscar obra por nombre");
        System.out.println("4 Buscar obras por artista");
        System.out.println("5 Eliminar obra");
        System.out.println("6 Encontrar obra mas barata");
        System.out.println("7 Encontrar obra mas moderna");
        System.out.println("8 Salir");
    }
    public static void addobra(){
        boolean correcto=true;
        boolean salida=false;
        sc.nextLine();
        while (correcto && !salida) {
            System.out.println();
            System.out.print("Introduce el nombre de la obra: ");
            String nombre = sc.nextLine();
            for (Obra o : obras){
                if (o.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Esta obra ya existe");
                    salida=true;
                    return;
                }
            }
            System.out.println();
            System.out.print("Introduce el tipo de obra: ");
            String tipo = sc.nextLine();
            if (!tipo.equalsIgnoreCase("oleo sobre madera")&&!tipo.equalsIgnoreCase("escultura")&&!tipo.equalsIgnoreCase("oleo sobre lienzo")) {
                System.out.println("Este tipo de obra no existe(oleo sobre madera/oleo sobre lienzo/escultura)");
                correcto=false;
            }
            System.out.println();
            System.out.print("Introduce el precio de la obra: ");
            int precio = sc.nextInt();
            System.out.println();
            System.out.print("Introduce el año de creacion: ");
            int anyo = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.print("Introduce al artista: ");
            String artista = sc.nextLine();

            if (tipo.equalsIgnoreCase("oleo sobre madera")){
                Obra obra = new Obra(nombre,Obra.tipo.OLEO_SOBRE_MADERA,precio,anyo,artista);
                obras.add(obra);
                System.out.println("oleo sobre madera añadida correctamente");
                salida=true;
            }
            if (tipo.equalsIgnoreCase("oleo sobre lienzo")){
                Obra obra = new Obra(nombre,Obra.tipo.OLEO_SOBRE_LIENZO,precio,anyo,artista);
                obras.add(obra);
                System.out.println("Lienzo añadido correctamente");
                salida=true;
            }
            if (tipo.equalsIgnoreCase("escultura")){
                Obra obra = new Obra(nombre,Obra.tipo.ESCULTURA,precio,anyo,artista);
                obras.add(obra);
                System.out.println("Escultura añadida correctamente");
                salida=true;
            }
            for (Obra obra:obras){
                System.out.println(obra.toString());
            }
        }
    }
    public static void addartista(){
        sc.nextLine();
        boolean existe=false;
        System.out.println();
        System.out.print("Introduce el nombre del artista: ");
        String nombre = sc.nextLine();
        System.out.println();
        System.out.print("Introduce la nacionalidad: ");
        String pais = sc.nextLine();
        Artista artista=new Artista(nombre, pais);
        for (Artista a : artistas){
            if (a.getNombre().equalsIgnoreCase(nombre)&&a.getNacionalidad().equalsIgnoreCase(pais)){
                existe=true;
            }
        }
        if (!existe){
            artistas.add(artista);
            System.out.println("Artista añadido correctamente");
        }else{
            System.out.println("El artista ya existe");
        }
    }
    public static void buscarobra(){
        sc.nextLine();
        System.out.println();
        System.out.print("Introduce el nombre de la obra a buscar: ");
        String nombre=sc.nextLine();
        for (Obra o: obras){
            if (o.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(o);
            }else{
                System.out.println("Obra no encontrada");
            }
        }
    }
    public static void eliminarobra(){
        sc.nextLine();
        System.out.println();
        System.out.print("Introduce el nombre de la obra a eliminar: ");
        String nombre= sc.nextLine();
        Iterator<Obra> iterator = obras.iterator();
        boolean encontrada = false;
        while (iterator.hasNext()) {
            Obra o = iterator.next();
            if (o.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                System.out.println("Obra eliminada.");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La obra no existe.");
        }
    }
    public static void buscarartista(){
        sc.nextLine();
        System.out.print("Introduce el nombre del artista para ver sus obras: ");
        String nombre = sc.nextLine();
        for (Obra o : obras){
            if (o.getArtista().equalsIgnoreCase(nombre)){
                System.out.println(o);
            } else {
                System.out.println("El artista no tiene obras");
            }
        }
    }
    public static void obrabarata(){
        Obra obra = obras.get(0);
        for (Obra o: obras){
            if (o.getPrecioaprox()< obra.getPrecioaprox()){
                obra = o;
            }
        }
        System.out.println("La obra mas barata es: ");
        System.out.println(obra);
    }
    public static void moderna(){
        Obra obra = obras.get(0);
        for (Obra o: obras){
            if (o.getFecha() > obra.getFecha()){
                obra = o;
            }
        }
        System.out.println("La obra mas moderna es: ");
        System.out.println(obra);
    }
}
