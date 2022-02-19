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
public class Alien extends Extraterrestre {
    String planeta;

    public Alien(String planeta, String nombre, String poder, String debilidad, boolean heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneSquad) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneSquad);
        this.planeta = planeta;
    }

    

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
    
    public void finalChance(){
    
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
}
