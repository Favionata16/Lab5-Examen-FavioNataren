/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5_progra2_favionataren;

import java.util.ArrayList;

/**
 *
 * @author favio
 */
public class escuadrones {
        String Nombre;
        String Lugar;
        String base;
        persona lider;
        boolean heroe_villa;
        ArrayList <persona> miebros=new ArrayList();

    public escuadrones() {
    }

    public escuadrones(String Nombre, String Lugar, String base, boolean heroe_villa) {
        this.Nombre = Nombre;
        this.Lugar = Lugar;
        this.base = base;
        this.lider = lider;
        this.heroe_villa = heroe_villa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public persona getLider() {
        return lider;
    }

    public void setLider(persona lider) {
        this.lider = lider;
    }

    public boolean isHeroe_villa() {
        return heroe_villa;
    }

    public void setHeroe_villa(boolean heroe_villa) {
        this.heroe_villa = heroe_villa;
    }

    public ArrayList<persona> getMiebros() {
        return miebros;
    }

    public void setMiebros(ArrayList<persona> miebros) {
        this.miebros = miebros;
    }

    @Override
    public String toString() {
        return "escuadrones " + "Nombre: " + Nombre + ", Lugar=" + Lugar + ", base=" + base + ", lider=" + lider + ", heroe_villa=" + heroe_villa + ", miebros=" + miebros + '}';
    }
        
}
