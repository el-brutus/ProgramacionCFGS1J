package UT6Hoja4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    private static Set<CuerpoCeleste> planetas = new HashSet<>();
    static void main(String[] args){
    Planeta mercurio = new Planeta("Mercurio", 88);
    sistemaSolar.put("Mercurio", mercurio);
    planetas.add(mercurio);

    Planeta venus = new Planeta("Venus", 225);
    sistemaSolar.put("Venus", venus);
    planetas.add(venus);
    Planeta tierra = new Planeta("Tierra", 365);
    sistemaSolar.put("La Tierra", tierra);
    planetas.add(tierra);
    Planeta marte = new Planeta("Marte", 687);
    sistemaSolar.put("Marte", marte);
    planetas.add(marte);
    Planeta jupiter = new Planeta("Jupiter", 4332);
    sistemaSolar.put("Jupiter", jupiter);
    planetas.add(jupiter);
    Planeta saturno = new Planeta("Saturno", 10759);
    sistemaSolar.put("Saturno",saturno);
    planetas.add(saturno);
    Planeta urano = new Planeta("Urano", 30660);
    sistemaSolar.put("Urano", urano);
    planetas.add(urano);
    Planeta neptuno = new Planeta("Neptuno", 165);
    sistemaSolar.put("Neptuno", neptuno);
    planetas.add(neptuno);
    Planeta pluton = new Planeta("Pluton", 248);
    sistemaSolar.put("Pluton", pluton);
    planetas.add(pluton);
    Luna luna = new Luna("Luna", 27);
    sistemaSolar.put("Luna",luna);
    tierra.addSatelite(luna);
    Luna deimos = new Luna("Deimos-1", 3);
    Luna phobos = new Luna("Phobos-0", 3);
    sistemaSolar.put("Deimos-1", deimos);
    marte.addSatelite(deimos);
    sistemaSolar.put("Phobos-0", phobos);
    marte.addSatelite(phobos);
    Luna io = new Luna("Io", 1.8);
    sistemaSolar.put("Io", io);
    jupiter.addSatelite(io);
    Luna europa = new Luna("Europa", 3.5);
    sistemaSolar.put("Europa", europa);
    jupiter.addSatelite(europa);
    Luna ganymelde = new Luna("Ganymelde", 7.1);
    sistemaSolar.put("Ganymelde", ganymelde);
    jupiter.addSatelite(ganymelde);
    Luna callisto = new Luna("Callisto", 16.7);
    sistemaSolar.put("Callisto", callisto);
    jupiter.addSatelite(callisto);

    for (CuerpoCeleste cuerpoCeleste : planetas){
        System.out.println(cuerpoCeleste.getNombre());
    }
    System.out.println();
    System.out.println("Lunas de marte: ");
    for (CuerpoCeleste cuerpoCeleste : marte.getSatelites()){
        System.out.println(cuerpoCeleste);
    }


    Set<CuerpoCeleste> lunas = new HashSet<>();
    System.out.println();
    for (CuerpoCeleste cuerpoCeleste : planetas){
        lunas.addAll(cuerpoCeleste.getSatelites());
    }
    System.out.println("Impresion de lunas:");

    for (CuerpoCeleste cuerpoCeleste : lunas){
        System.out.println(cuerpoCeleste);
    }

    Planeta pluton2 = new Planeta("Pluton", 884);
    sistemaSolar.put("Pluton", pluton2);
    planetas.add(pluton2);
        System.out.println("Pluton duplicado: ");
    for (CuerpoCeleste cuerpoCeleste : planetas){
    System.out.println(cuerpoCeleste.toString());
    }

        System.out.println();
    PlanetaEnano pluton3 = new PlanetaEnano("Pluton", 884);
    sistemaSolar.put("Pluton", pluton3);
    planetas.add(pluton3);
        System.out.println("Pluton como planeta enano");
        for (CuerpoCeleste cuerpoCeleste : planetas){
            System.out.println(cuerpoCeleste.toString());
        }


    Set<CuerpoCeleste> set1 = new HashSet<>(tierra.getSatelites());
        set1.add(europa);
    Set<CuerpoCeleste> set2 = new HashSet<>(jupiter.getSatelites());
    //Interseccion
    set1.retainAll(set2);
        System.out.println("Nos muestra que tienen en común los 2 set");
        System.out.println("Interseccion: " + set1);
    //Diferencia
    Set<CuerpoCeleste> diferencia = new HashSet<>(set1);
    diferencia.retainAll(set2);
        System.out.println("Muestra la diferencia entre los 2 set");
        System.out.println("Diferencia: " + set2);

    }
}
