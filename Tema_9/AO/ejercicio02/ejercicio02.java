/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AO.ejercicio02;

/**
 *
 * @author 7300HQ
 */
public class ejercicio02 {
    
    public static void main(String[] args) {

        Gato[] gatos = new Gato[4];

        gatos[0] = new Gato("garfield", "siames", 4);

        for (int i=0; i<4;i++){
            System.out.println(gatos[i]);
        }

    }

}
