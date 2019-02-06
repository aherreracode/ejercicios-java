
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author 7300HQ
 */
public class ejercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        Coche Skyline = new Coche(320, 500, "Nissan", "Skyline");
        Bicicleta Orbea = new Bicicleta(2, 10, "Orbea", "Continental");

        do {

            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    Orbea.AndaBici();
                    break;
                case 2:
                    Orbea.CabBici();
                    break;
                case 3:
                    Skyline.AndaCoche();
                    break;
                case 4:
                    Skyline.QuemaCoche();
                    break;
                case 5:
                    System.out.println(Orbea.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println(Skyline.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales());
                    break;
                default:
                    break;
            }

        } while (num != 8);

    }

}
