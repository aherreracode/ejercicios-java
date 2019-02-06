/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.ejercicio02;

/**
 *
 * @author 7300HQ
 */
public class Coche extends Vehiculo{

    private int cv;

    public Coche(int cv, int kilometrosRecorridos, String marca, String modelo) {
        super(kilometrosRecorridos, marca, modelo);
        this.cv = cv;
        kilometrosTotales += kilometrosRecorridos;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
    
    
    
    void AndaCoche() {
        System.out.println("El coche esta andando");
    }
    
    void QuemaCoche() {
        System.out.println("El coche esta quemando rueda");
    }
    
    
    
}
