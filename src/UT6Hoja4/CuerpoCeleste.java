package UT6Hoja4;

import java.util.HashSet;
import java.util.Objects;
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

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo){
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        this.satelites = new HashSet<>(
        );

    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }
    public Set<CuerpoCeleste> getSatelites(){
        return satelites;
    }

    public boolean addSatelite(CuerpoCeleste cuerpoCeleste){
            if (!this.satelites.contains(cuerpoCeleste)) {
                satelites.add(cuerpoCeleste);
                return true;
            }

        return false;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CuerpoCeleste satelite = (CuerpoCeleste) obj;

        return Objects.equals(nombre, satelite.nombre) && tipoCuerpo == satelite.tipoCuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipoCuerpo);
    }

    @Override
    public String toString() {
        return nombre + ": " + tipoCuerpo + ", " + periodoOrbital;
    }

}

