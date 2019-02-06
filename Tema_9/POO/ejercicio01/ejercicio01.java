/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.ejercicio01;

/**
 *
 * @author 7300HQ
 */
public class ejercicio01 {

    public static void main(String[] args) {

        caballo rocinante = new caballo(8, "Rocinante", "negro", "macho");

        caballo paco = new caballo("paco");

        System.out.println("¿Como es el caballo rocinante?");

        System.out.println("--------Ficha del caballo--------");
        System.out.println("Nombre: " + rocinante.getNombre());
        System.out.println("Edad:   " + rocinante.getEdad());
        System.out.println("Sexo:   " + rocinante.getSexo());
        System.out.println("Color:  " + rocinante.getColor());
        System.out.println("---------------------------------");

        System.out.println("¿Que le gusta hacer a el caballo rocinante?");

        rocinante.gusto();

        System.out.println("---------------------------------");

        System.out.println("¿Como es el caballo paco?");

        //Mostrar datos con metodo ToString
        System.out.println(paco);

    }
}
