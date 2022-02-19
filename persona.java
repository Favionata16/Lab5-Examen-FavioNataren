/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5_progra2_favionataren;

/**
 *
 * @author favio
 */
public abstract class persona {
    String nombre;
    String poder;
    String debilidad;
    boolean heroeVillano;
    int fuerza;
    int habilidadMental;
    int habilidadFisica;
    boolean tieneSquad;

    public persona(String nombre, String poder, String debilidad, boolean heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneSquad) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroeVillano = heroeVillano;
        this.fuerza = fuerza;
        this.habilidadMental = habilidadMental;
        this.habilidadFisica = habilidadFisica;
        this.tieneSquad = tieneSquad;
    }

    public persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public boolean getHeroe_vilano() {
        return heroeVillano;
    }

    public void setHeroe_vilano(boolean heroeVillano) {
        this.heroeVillano = heroeVillano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidad_mental() {
        return habilidadMental;
    }

    public void setHabilidad_mental(int habilidadMental) {
        this.habilidadMental = habilidadMental;
    }

    public int getHabilidad_ficica() {
        return habilidadFisica;
    }

    public void setHabilidad_ficica(int habilidadFisica) {
        this.habilidadFisica = habilidadFisica;
    }

    public boolean isTiene_escuadron() {
        return tieneSquad;
    }

    public void setTiene_escuadron(boolean tieneSquad) {
        this.tieneSquad = tieneSquad;
    }

    @Override
    public String toString() {
        if (heroe_vilano==true) {
            return "persona " + "nombre=" + nombre + ", poder: " + poder ;
        }else{
            return "persona " + "nombre=" + nombre + ", debilidad=" + debilidad ;
        }
    }

    
    public abstract void finalChance();
}
