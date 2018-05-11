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

public class Laboratorio3_LeonardoMontoya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int enemigoscant = 5;
        int pasos = 50;
        armadura r = new armadura(5, "r", "usual");
        talismanes gg = new talismanes(10, "gg", "insual");
        arma stormbreaker = new arma(5, "Stormbreaker", "raro");
        maldicion m2 = new maldicion(2, "m2", "inusual");
        talismanes t = new talismanes(1, "t", "usual");
        arma p2 = new arma(4, "p2", "inusual");
        maldicion lab3 = new maldicion(7, "lab3", "raro");
        armadura knight = new armadura(1, "knight", "inusual");
        talismanes elixir = new talismanes(2, "elixir", "raro");
        arma gun = new arma(3, "gun", "usual");
        ArrayList<objetos> objetos = new ArrayList();
        objetos.add(r);
        objetos.add(gg);
        objetos.add(stormbreaker);
        objetos.add(m2);
        objetos.add(p2);
        objetos.add(t);
        objetos.add(lab3);
        objetos.add(knight);
        objetos.add(elixir);
        objetos.add(gun);
        ArrayList<objetos> mochila = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        char resp = 's';
        while (resp == 's') {
            System.out.println("1)Iniciar");
            System.out.println("2)Dificultad");
            System.out.println("3)Salir");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese raza: \n1)Mago \n2)Berzerk  \n3)Picaro \n 4)Arquero\n");
                    int opperson = entrada.nextInt();
                    System.out.println("Ingrese 1 si quere un personaje predeterminado 2 si quiere personalizarlo");
                    int pred = entrada.nextInt();
                    PersonajeAliado user;
                    if (pred == 1) {
                        switch (opperson) {
                            case 1:
                                user = new mago();
                                break;
                            case 2:
                                user = new berzerk();
                                break;
                            case 3:
                                user = new picaro();
                                break;
                            case 4:
                                user = new arquero();
                                break;
                        }
                    } else {
                        System.out.println("Ingrese el nombre de su personaje");
                        String nombre = entrada2.nextLine();
                        System.out.println("Ingrese estatura");
                        int est = entrada.nextInt();
                        System.out.println("Ingrese peso");
                        int peso = entrada.nextInt();
                        System.out.println("Ingrese color de piel");
                        String piel = entrada2.nextLine();
                        System.out.println("Ingrese pelo");
                        String pelo = entrada2.nextLine();
                        System.out.println("Ingrese raza");
                        String raza = entrada2.nextLine();
                        switch (opperson) {
                            case 1:
                                user = new mago(nombre, est, peso, piel, pelo, raza);
                                break;
                            case 2:
                                user = new berzerk(nombre, est, peso, piel, pelo, raza);
                                break;
                            case 3:
                                user = new picaro(nombre, est, peso, piel, pelo, raza);
                                break;
                            case 4:
                                user = new arquero(nombre, est, peso, piel, pelo, raza);
                                break;
                        }
                    }

                    break;
                case 2:
                    System.out.println("Ingrese 1)dificultad facil 2)dificultad media 3)dificultad dificil");
                    int dificultad = entrada.nextInt();
                    if (dificultad == 2) {
                        enemigoscant = 10;
                        pasos = 100;
                    } else if (dificultad == 3) {
                        enemigoscant = 15;
                        pasos = 120;
                    }
                    break;
                case 3:
                    System.out.println("Gracias por jugar");
                    resp = 's';
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

}
