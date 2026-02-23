package UT6Hoja4;

import java.util.HashSet;
import java.util.Set;

public class CuerpoCeleste {
    public enum TipoCuerpoCeleste {
        ESTRELLA,
        PLANETA,
        PLANETA_ENANO,
        LUNA,
        COMETA,
        ASTEROIDE
    }
    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, Set<CuerpoCeleste> satelites, TipoCuerpoCeleste tipoCuerpo){
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.satelites = satelites;
        this.tipoCuerpo = tipoCuerpo;
        this.satelites = new HashSet<>(
        );

    }

    private String getNombre() {
        return nombre;
    }

    private double getPeriodoOrbital() {
        return periodoOrbital;
    }

    private TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }
    private Set<CuerpoCeleste> getSatelites(){
        return satelites;
    }

    private boolean addSatelite(CuerpoCeleste cuerpoCeleste){
            if (!this.satelites.contains(cuerpoCeleste)) {
                satelites.add(cuerpoCeleste);
                return true;
            }

        return false;
    }
    private boolean equals(CuerpoCeleste cuerpoCeleste, CuerpoCeleste cuerpoCeleste2){
        if (cuerpoCeleste.getNombre().equals(cuerpoCeleste2.getNombre())){
            return true;
        }
        return false;
    }

}

