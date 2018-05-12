/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_leonardomontoya;

/**
 *
 * @author Inspiron
 */
public class berzerk extends PersonajeAliado {
    public berzerk() {
        super(190,80,80,20,15,"ah","berzerk",110,110,"negro","negro","elfo",30);
    }

    public berzerk(String nombre, int estatura, int peso, String colorpiel, String colorpelo, String raza) {
        super(190,80,80,20,15,"ah", nombre, estatura, peso, colorpiel, colorpelo, raza,30);
    }

    @Override
    public String toString() {
        return "berzerk{" + '}'+super.toString();
    }
    
    
}
