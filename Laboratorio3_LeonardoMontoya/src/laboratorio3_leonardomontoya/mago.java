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
        super(120,20,70,10,20,"Hola","Nando",170,90,"blanco","negro","humano",2);
        this.ap = 20;
    }

    public mago(int ap) {
        this.ap = ap;
    }

    public mago(int ap, int hp, int ad, int eficacia, int velocidad, int suerte, String grito, String nombre, int estatura, int peso, String colorpiel, String colorpelo, String raza, int pcritico) {
        super(120,20,70,10,20, grito, nombre, estatura, peso, colorpiel, colorpelo, raza, pcritico);
        this.ap = ap;
    }


    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    @Override
    public String toString() {
        return "mago{" + "ap=" + ap + '}';
    }
    
  
    
}
