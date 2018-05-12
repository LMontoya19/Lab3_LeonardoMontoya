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
public class picaro extends PersonajeAliado {

    public picaro() {
        super(150, 55, 85, 30, 50, "ha", "picaro", 50, 20, "blanco", "rubio", "enano", 60);
    }

    public picaro(String nombre, int estatura, int peso, String colorpiel, String colorpelo, String raza) {
        super(150, 55, 85, 30, 50, "ha", nombre, estatura, peso, colorpiel, colorpelo, raza, 30);
    }

    @Override
    public String toString() {
        return "picaro{" + '}'+super.toString();
    }

}
