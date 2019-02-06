/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AO.ejercicio03;

import java.util.Scanner;

/**
 *
 * @author 7300HQ
 */
public class ejercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Disco[] coleccion = new Disco[10];

        int num = 0;

        for (int i = 0; i < 10; i++) {
            coleccion[i] = new Disco();
        }

        do {

            System.out.println("Coleccion de discos");
            System.out.println("====================");
            System.out.println("1. Crear disco");
            System.out.println("2. Borrar disco");
            System.out.println("3. Ver disco");
            System.out.println("4. Ver coleccion de discos");
            System.out.println("5. Salir");
            num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
                    System.out.println("Introduce numero de disco:");
                    num = Integer.parseInt(sc.nextLine());

                    System.out.println("Introduce el autor:");
                    String autor = sc.nextLine();

                    System.out.println("Introduce el titulo:");
                    String titulo = sc.nextLine();

                    System.out.println("Introduce genero:");
                    String genero = sc.nextLine();

                    System.out.println("Introduce la duracion en minutos:");
                    int duracion = Integer.parseInt(sc.nextLine());

                    coleccion[num] = new Disco(autor, titulo, genero, duracion);
                    break;
                case 2:
                    System.out.println("Introduce numero de disco:");
                    num = Integer.parseInt(sc.nextLine());
                    coleccion[num] = new Disco();

                    break;
                case 3:
                    System.out.println("Introduce numero de disco:");
                    num = Integer.parseInt(sc.nextLine());
                    System.out.println(coleccion[num]);
                    
                    break;
                case 4:
                    for (int i = 0; i < 10; i++) {
                        System.out.println(coleccion[i]);
                    }
                    
                    break;
            }

        } while (num != 5);

    }

}
