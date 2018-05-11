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
public class penemigo {

    private int hp;
    private int ad;
    private int eficacia;
    private int critico;
    private int velocidad;
    private int edad;
    private String nombre;
    private int estatura;
    private int peso;
    
    public penemigo(int hp, int ad, int eficacia, int critico, int velocidad, int edad, String nombre, int estatura, int peso) {
        this.hp = hp;
        this.ad = ad;
        this.eficacia = eficacia;
        this.critico = critico;
        this.velocidad = velocidad;
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
    }

    public penemigo() {
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "penemigo{" + "hp=" + hp + ", ad=" + ad + ", eficacia=" + eficacia + ", critico=" + critico + ", velocidad=" + velocidad + ", edad=" + edad + ", nombre=" + nombre + ", estatura=" + estatura + ", peso=" + peso + '}';
    }

}
