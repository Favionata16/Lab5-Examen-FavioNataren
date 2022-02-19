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
public class SuperHumano extends persona {
    String Superpoder;
    public  void final_chance(){
    
    }

    public SuperHumano(String Superpoder, String nombre, String poder, String debilidad, boolean heroeVillano, int fuerza, int habilidadmental, int habilidadFisica, boolean tieneSquad) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadmental, habilidadFisica, tieneSquad);
        this.Superpoder = Superpoder;
    }

    

    public SuperHumano() {
    }

    public String getSuperpoder() {
        return Superpoder;
    }

    public void setSuperpoder(String Superpoder) {
        this.Superpoder = Superpoder;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
