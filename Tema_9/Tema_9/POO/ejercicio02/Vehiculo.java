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
public abstract class Vehiculo {
    private static int vehiculosCreados = 0;
    static int kilometrosTotales = 0;
    private int kilometrosRecorridos;
    private String marca;
    private String modelo;

    public Vehiculo(int kilometrosRecorridos, String marca, String modelo) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.marca = marca;
        this.modelo = modelo;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void setKilometrosTotales(int kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    
}
