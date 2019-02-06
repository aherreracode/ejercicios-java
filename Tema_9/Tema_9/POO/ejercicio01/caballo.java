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
public class caballo {
    private int edad;
    private String nombre;
    private String color;
    private String sexo;


    public caballo(int edad, String nombre, String color, String sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
        this.sexo = sexo;
    }

    public caballo(String nombre) {
        this.nombre = nombre;
        this.color = "negro";
        this.edad = 0;
        this.sexo = "macho";
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getSexo() {
        return sexo;
    }
    
    @Override
    public String toString() {
        String mostrar = "--------Ficha del caballo--------\n";
        mostrar += "Nombre: "+ nombre+"\n";
        mostrar += "Edad:   "+ edad+"\n";
        mostrar += "Sexo:   "+ sexo+"\n";
        mostrar += "Color:  "+ color+"\n";
        mostrar += "---------------------------------\n";
        return mostrar;
    }
 
    void gusto() {
        System.out.println("El caballo le gusta trotar");
    }
    
    void caballito() {
        System.out.println("El caballo está haciendo el caballito");
    }

    
    
    
    
    
    
    
    
    
    
    
}
