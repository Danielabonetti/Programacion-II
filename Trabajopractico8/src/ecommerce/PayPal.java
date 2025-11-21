/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author Daniela Bonetti
 */


public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal por $" + monto);
    }
}
