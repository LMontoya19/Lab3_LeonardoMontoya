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
public class PersonajeAliado {
    private int hp;
    private int ad;
    private int eficacia;
    private int velocidad;
    private int suerte;
    private String grito;
    private String nombre;
    private int estatura;
    private int peso;
    private String colorpiel;
    private String colorpelo;
    private String raza;
    private int pcritico;
    public PersonajeAliado() {
    }

    public PersonajeAliado(int hp, int ad, int eficacia, int velocidad, int suerte, String grito, String nombre, int estatura, int peso, String colorpiel, String colorpelo, String raza, int pcritico) {
        this.hp = hp;
        this.ad = ad;
        this.eficacia = eficacia;
        this.velocidad = velocidad;
        this.suerte = suerte;
        this.grito = grito;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.colorpiel = colorpiel;
        this.colorpelo = colorpelo;
        this.raza = raza;
        this.pcritico = pcritico;
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

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
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

    public String getColorpiel() {
        return colorpiel;
    }

    public void setColorpiel(String colorpiel) {
        this.colorpiel = colorpiel;
    }

    public String getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(String colorpelo) {
        this.colorpelo = colorpelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPcritico() {
        return pcritico;
    }

    public void setPcritico(int pcritico) {
        this.pcritico = pcritico;
    }

    @Override
    public String toString() {
        return "PersonajeAliado{" + "hp=" + hp + ", ad=" + ad + ", eficacia=" + eficacia + ", velocidad=" + velocidad + ", suerte=" + suerte + ", grito=" + grito + ", nombre=" + nombre + ", estatura=" + estatura + ", peso=" + peso + ", colorpiel=" + colorpiel + ", colorpelo=" + colorpelo + ", raza=" + raza + '}';
    }
    
}
