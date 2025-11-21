/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Daniela Bonetti
 */


public class Gato extends Animal {

    public Gato() {
        super("Gato");
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }
}
