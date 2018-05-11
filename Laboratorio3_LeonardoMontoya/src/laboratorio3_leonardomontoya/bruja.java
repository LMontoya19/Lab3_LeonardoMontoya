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
import java.util.*;

public class bruja extends penemigo {

    private int ap;
    Random r = new Random();

    public bruja() {
        super();
        this.ap = 20 + r.nextInt(40);
        super.setHp(60 + r.nextInt(80));
        super.setAd(5 + r.nextInt(10));
        super.setEficacia(10 + r.nextInt(30));
        super.setCritico(1);
        super.setVelocidad(3 + r.nextInt(7));
        super.setNombre("Bruja");
        super.setEstatura(70);
        super.setPeso(50);
        super.setEdad(100);
    }

    public int getAp() {
        return ap;
    }

    @Override
    public String toString() {
        return "bruja{" + "ap=" + ap + '}' + super.toString();
    }

}
