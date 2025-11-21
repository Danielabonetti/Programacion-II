/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Daniela Bonetti
 */


public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String describirAnimal() {
        return "Animal: " + nombre;
    }

    public String hacerSonido() {
        return "Sonido genérico";
    }
}
