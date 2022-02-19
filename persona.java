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
    boolean heroe_vilano;
    int fuerza;
    int habilidadMental;
    int habilidadFisica;
    boolean tieneSquad;

    public persona(String nombre, String poder, String debilidad, boolean heroe_vilano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneSquad) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroe_vilano = heroe_vilano;
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
        return heroe_vilano;
    }

    public void setHeroe_vilano(boolean heroe_vilano) {
        this.heroe_vilano = heroe_vilano;
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

    public int getHabilidadFisica() {
        return habilidadFisica;
    }

    public void setHabilidad_ficica(int habilidadFisica) {
        this.habilidadFisica = habilidadFisica;
    }

    public boolean isTieneSquad() {
        return tieneSquad;
    }

    public void setTiene_escuadron(boolean tieneSquad) {
        this.tieneSquad = tieneSquad;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", fuerza=" + fuerza + ", habilidad mental=" + habilidadMental + ", habilidad fisica=" + habilidadFisica + ", tiene escuadron=" + tieneSquad + '}';
    }

    
    public abstract void finalChance();
}
