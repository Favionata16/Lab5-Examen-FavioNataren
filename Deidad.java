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
public class Deidad extends Extraterrestre {
    boolean creyentes;
    String religion;

    public Deidad(boolean creyentes, String religion) {
        this.creyentes = creyentes;
        this.religion = religion;
    }

    

    public boolean isCreyentes() {
        return creyentes;
    }

    public void setCreyentes(boolean creyentes) {
        this.creyentes = creyentes;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    
    public void finalChance(){
    
    }

    
}
