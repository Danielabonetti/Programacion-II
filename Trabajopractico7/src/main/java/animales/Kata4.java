/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Daniela Bonetti
 */
import java.util.*;

public class Kata4 {
    public static void main(String[] args) {
        List<Animal> animales = Arrays.asList(
            new Perro(),
            new Gato(),
            new Vaca()
        );

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }
    }
}