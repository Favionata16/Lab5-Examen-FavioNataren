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
    public  void finalChance(){
    
    }

    public SuperHumano(String Superpoder, String nombre, String poder, String debilidad, boolean heroe_vilano, int fuerza, int habilidadMental, int habilidadFisica, boolean tiene_escuadron) {
        super(nombre, poder, debilidad, heroe_vilano, fuerza, habilidadMental, habilidadFisica, tiene_escuadron);
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
}
