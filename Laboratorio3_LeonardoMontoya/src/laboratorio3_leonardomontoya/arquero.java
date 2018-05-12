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
public class arquero extends PersonajeAliado {

    public arquero() {
        super(150, 50, 85, 15, 20, "puu", "Lego", 110, 70, "blanco", "rubio", "elfo", 60);
    }

    public arquero(String nombre, int estatura, int peso, String colorpiel, String colorpelo, String raza) {
        super(150, 50, 85, 15, 20, "PUU", nombre, estatura, peso, colorpiel, colorpelo, raza, 60);
    }

    @Override
    public String toString() {
        return "arquero{" + '}'+super.toString();
    }

}
