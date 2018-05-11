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

public class orco extends penemigo {

    Random r = new Random();

    public orco() {
        super.setHp(70 + r.nextInt(90));
        super.setAd(30 + r.nextInt(45));
        super.setEficacia(20 + r.nextInt(50));
        super.setCritico(60);
        super.setVelocidad(20);
        super.setEdad(10);
        super.setNombre("Orco");
        super.setEstatura(70);
        super.setPeso(200);
    }

}
