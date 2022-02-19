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
public class mutante extends persona{
    ArrayList <String> factores=new ArrayList();
    public  void finalChance(){
    
    }

    public mutante(String nombre, String poder, String debilidad, boolean heroe_vilano, int fuerza, int habilidadMental, int habilidad_ficica, boolean tiene_escuadron) {
        super(nombre, poder, debilidad, heroe_vilano, fuerza, habilidadMental, habilidad_ficica, tiene_escuadron);
    }

    public mutante() {
    }

    public ArrayList<String> getFactores() {
        return factores;
    }

    public void setFactores(ArrayList<String> factores) {
        this.factores = factores;
    }
}
