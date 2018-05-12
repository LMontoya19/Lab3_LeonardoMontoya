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
public class mago extends PersonajeAliado {

    private int ap;

    public mago() {
        super(120, 20, 70, 10, 20, "Hola", "Nando", 170, 90, "blanco", "negro", "humano", 2);
        this.ap = 20;
    }

    public mago(String nombre, int estatura, int peso, String colorpiel, String colorpelo, String raza) {
        super(120, 20, 70, 10, 20, "Hola", nombre, estatura, peso, colorpiel, colorpelo, raza, 2);
        this.ap = 20;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    @Override
    public String toString() {
        return "mago{" + "ap=" + ap + '}'+super.toString();
    }

   

}
