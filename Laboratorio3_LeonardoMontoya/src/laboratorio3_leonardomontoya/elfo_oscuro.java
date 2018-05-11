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

public class elfo_oscuro extends penemigo {

    Random r = new Random();
    private arma arma2;
    public elfo_oscuro() {
        super();
        super.setHp(60 + r.nextInt(120));
        super.setAd(30 + r.nextInt(50));
        super.setEficacia(50 + r.nextInt(70));
        super.setCritico(0 + r.nextInt(100));
        super.setVelocidad(20);
        super.setEdad(500);
        super.setNombre("Elfo Oscuro");
        super.setEstatura(80);
        super.setPeso(80);
        this.arma2 = new arma(1,"holi","raro");
    }

}
