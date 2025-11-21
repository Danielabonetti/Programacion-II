/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniela Bonetti
 */
import ecommerce.*;
import excepciones.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PARTE 1: E-COMMERCE ===");

        Cliente cliente = new Cliente("Dani");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 8000));
        pedido.agregarProducto(new Producto("Teclado", 12000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(total);

        tarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("ENVIADO");

        System.out.println("\n=== PARTE 2: EXCEPCIONES ===");

        // 1. División segura
        try {
            int a = 10;
            int b = 0;
            int r = a / b;
            System.out.println(r);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }

        // 2. Conversión
        try {
            int numero = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: no es un número válido.");
        }

        // 3. Lectura de archivo
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer archivo.");
        }

        // 4. Excepción personalizada
        try {
            validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 5. Try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error try-with-resources.");
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango.");
        }
    }
}
