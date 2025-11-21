/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Daniela Bonetti
 */


public class Perro extends Animal {

    public Perro() {
        super("Perro");
    }

    @Override
    public String hacerSonido() {
        return "Guau guau";
    }
}
