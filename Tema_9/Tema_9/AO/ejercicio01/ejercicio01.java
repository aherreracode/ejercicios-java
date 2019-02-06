/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AO.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author 7300HQ
 */
public class ejercicio01 {

    public static void main(String[] args) {

        Gato[] gatos = new Gato[4];

        Scanner sc = new Scanner(System.in);

        int edad = 0;
        String raza = " ";
        String nombre = " ";
        
        for (int i = 0; i < 4; i++) {

            System.out.println("nombre:");
            nombre = sc.nextLine();

            System.out.println("raza:");
            raza = sc.nextLine();

            System.out.println("edad:");
            edad = Integer.parseInt(sc.nextLine());

            gatos[i] = new Gato(nombre, raza, edad);
        }
        
        for (int i=0; i<4;i++){
            System.out.println(gatos[i]);
        }

    }

}
