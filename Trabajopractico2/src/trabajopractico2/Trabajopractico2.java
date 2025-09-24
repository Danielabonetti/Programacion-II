/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajopractico2;

import java.util.Scanner;

public class TrabajoPractico2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // ----------------- EJERCICIO 1 -----------------
        System.out.println("\n--- Ejercicio 1: Verificación de Año Bisiesto ---");
        System.out.print("Introduce un año: ");
        int anio = entrada.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        // ----------------- EJERCICIO 2 -----------------
        System.out.println("\n--- Ejercicio 2: Determinar el Mayor de Tres Números ---");
        System.out.print("Ingrese el primer número: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = entrada.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = entrada.nextInt();

        int mayor = num1;
        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;

        System.out.println("El mayor es: " + mayor);

        // ----------------- EJERCICIO 3 -----------------
        System.out.println("\n--- Ejercicio 3: Clasificación de Edad ---");
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }

        // ----------------- EJERCICIO 4 -----------------
        System.out.println("\n--- Ejercicio 4: Calculadora de Descuento según Categoría ---");
        System.out.print("Ingrese el precio del producto: ");
        double precio = entrada.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = entrada.next().toUpperCase().charAt(0);

        double descuento = 0;
        switch (categoria) {
            case 'A':
                descuento = 0.10;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría inválida.");
        }

        if (descuento > 0) {
            double precioFinal = precio - (precio * descuento);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final: " + precioFinal);
        }

        // ----------------- EJERCICIO 5 -----------------
        System.out.println("\n--- Ejercicio 5: Suma de Números Pares (while) ---");
        int numeroWhile;
        int sumaPares = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numeroWhile = entrada.nextInt();
            if (numeroWhile % 2 == 0 && numeroWhile != 0) {
                sumaPares += numeroWhile;
            }
        } while (numeroWhile != 0);

        System.out.println("La suma de los números pares es: " + sumaPares);

        // ----------------- EJERCICIO 6 -----------------
        System.out.println("\n--- Ejercicio 6: Contador de Positivos, Negativos y Ceros (for) ---");
        int positivos = 0, negativos = 0, ceros = 0;
        int numero;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        // ----------------- EJERCICIO 7 -----------------
        System.out.println("\n--- Ejercicio 7: Validación de Nota (do-while) ---");
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = entrada.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");

        // ----------------- EJERCICIO 8 -----------------
        System.out.println("\n--- Ejercicio 8: Cálculo del Precio Final con impuesto y descuento ---");
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = entrada.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        double impuesto = entrada.nextDouble() / 100; // lo paso a decimal
        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        double desc = entrada.nextDouble() / 100; // lo paso a decimal

        double precioConDescuento = calcularPrecioFinal(precioBase, impuesto, desc);
        System.out.println("El precio final del producto es: " + precioConDescuento);

        entrada.close();
    }

    // Función del Ejercicio 8
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
        
    }
        
        
        /*Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0*/

     
    double calcularCostoEnvio (double peso, String zona){
    double totalPeso = 0;    
    if (zona.equalsIgnoreCase("nacional")){
    totalPeso = 5*peso;
    
            }
    if (zona.equalsIgnoreCase("internacional")){
    totalPeso = 10*peso;
    }
    return totalPeso;       
    }
    
    double calcularTotalCompra (double precioProducto, double costoEnvio){
    double calcularTotal = precioProducto + costoEnvio;
    return calcularTotal;
    }
}



