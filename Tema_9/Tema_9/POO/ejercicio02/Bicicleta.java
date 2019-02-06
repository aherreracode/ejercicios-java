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
public class Bicicleta extends Vehiculo{
    
    private int ruedas;

    public Bicicleta(int ruedas, int kilometrosRecorridos, String marca, String modelo) {
        super(kilometrosRecorridos, marca, modelo);
        this.ruedas = ruedas;
        kilometrosTotales += kilometrosRecorridos;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
    
    
    void AndaBici(){
        System.out.println("La bici esta andando");
    }
    
    void CabBici() {
        System.out.println("La bici esta haciendo el caballito");
    }
    
    
    
    
}
