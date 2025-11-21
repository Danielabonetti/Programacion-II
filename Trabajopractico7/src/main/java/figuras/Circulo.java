/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Daniela Bonetti
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        super("Círculo"); // 👉 llama al constructor de Figura que necesita un String
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
