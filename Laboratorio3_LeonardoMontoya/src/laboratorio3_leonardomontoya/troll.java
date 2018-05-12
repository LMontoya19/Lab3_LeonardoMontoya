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
public class troll extends penemigo {
Random r = new Random();
    public troll() {
        super();
        super.setHp(50 + r.nextInt(80));
        super.setAd(30 + r.nextInt(50));
        super.setEficacia(50 + r.nextInt(65));
        super.setCritico(15+r.nextInt(20));
        super.setVelocidad(10);
        super.setEdad(50);
        super.setNombre("Troll");
        super.setEstatura(200);
        super.setPeso(500);
    }
    
    
}
