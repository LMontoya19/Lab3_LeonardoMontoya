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
public class bruja {
    private int ap;
    Random r;
    public bruja() {
        this.r = new Random();
        super(60+r.nextInt(80),5+r.nextInt(10),10+r.nextInt(30),1,3+r.nextInt(7),100,"Bruja",70,50);
        this.ap = 20+r.nextInt(40);
    }
    
}
