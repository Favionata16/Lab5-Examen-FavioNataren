
package examenlab5_progra2_favionataren;

import java.util.ArrayList;

/**
 *
 * @author favio
 */
public class universo {
    String nombre;
    ArrayList <escuadrones> escua=new ArrayList();

    public universo(String nombre) {
        this.nombre = nombre;
    }

    public universo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<escuadrones> getEscua() {
        return escua;
    }

    public void setEscua(ArrayList<escuadrones> escua) {
        this.escua = escua;
    }

    @Override
    public String toString() {
        return " nombre: " + nombre + ", Escuadrones En El Universo: " + escua ;
    }
}
