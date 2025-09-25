package Trabajopractico2;

import java.util.Scanner;
// @author Daniela Bonetti

public class Trabajopractico2 {

    // ----------------- Variables globales -----------------
    static double DESCUENTO_ESPECIAL = 0.10;

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

        if (edad < 12) System.out.println("Eres un Niño.");
        else if (edad <= 17) System.out.println("Eres un Adolescente.");
        else if (edad <= 59) System.out.println("Eres un Adulto.");
        else System.out.println("Eres un Adulto mayor.");

        // ----------------- EJERCICIO 4 -----------------
        System.out.println("\n--- Ejercicio 4: Calculadora de Descuento según Categoría ---");
        System.out.print("Ingrese el precio del producto: ");
        double precio = entrada.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = entrada.next().toUpperCase().charAt(0);

        double descuento = 0;
        switch (categoria) {
            case 'A': descuento = 0.10; break;
            case 'B': descuento = 0.15; break;
            case 'C': descuento = 0.20; break;
            default: System.out.println("Categoría inválida.");
        }

        if (descuento > 0) {
            double precioFinal = precio - (precio * descuento);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final: " + precioFinal);
        }

        // ----------------- EJERCICIO 5 -----------------
        System.out.println("\n--- Ejercicio 5: Suma de Números Pares (while) ---");
        int numeroWhile, sumaPares = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numeroWhile = entrada.nextInt();
            if (numeroWhile % 2 == 0 && numeroWhile != 0) sumaPares += numeroWhile;
        } while (numeroWhile != 0);
        System.out.println("La suma de los números pares es: " + sumaPares);

        // ----------------- EJERCICIO 6 -----------------
        System.out.println("\n--- Ejercicio 6: Contador de Positivos, Negativos y Ceros (for) ---");
        int positivos = 0, negativos = 0, ceros = 0, numero;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextInt();
            if (numero > 0) positivos++;
            else if (numero < 0) negativos++;
            else ceros++;
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
            if (nota < 0 || nota > 10) System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");

        // ----------------- EJERCICIO 8 -----------------
        System.out.println("\n--- Ejercicio 8: Cálculo del Precio Final con impuesto y descuento ---");
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = entrada.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        double impuesto = entrada.nextDouble() / 100;
        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        double desc = entrada.nextDouble() / 100;

        double precioConDescuento = calcularPrecioFinal(precioBase, impuesto, desc);
        System.out.println("El precio final del producto es: " + precioConDescuento);

        // ----------------- EJERCICIO 10 -----------------
        System.out.println("\n--- Ejercicio 10: Actualización de Stock ---");
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = entrada.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = entrada.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = entrada.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        // ----------------- EJERCICIO 11 -----------------
        System.out.println("\n--- Ejercicio 11: Descuento Especial ---");
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto11 = entrada.nextDouble();

        double precioFinal11 = calcularDescuentoEspecial(precioProducto11);
        System.out.println("El precio final con descuento es: " + precioFinal11);

        // ----------------- EJERCICIO 12 -----------------
        System.out.println("\n--- Ejercicio 12: Array de Precios ---");
        double[] precios = {199.99, 299.50, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + p);

        precios[2] = 129.99; // Modificar un precio
        System.out.println("Precios modificados:");
        for (double p : precios) System.out.println("Precio: $" + p);

        // ----------------- EJERCICIO 13 -----------------
        System.out.println("\n--- Ejercicio 13: Impresión Recursiva de Array ---");
        double[] preciosRecursivos = {199.99, 299.50, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(preciosRecursivos, 0);

        preciosRecursivos[2] = 129.99; // Modificar un precio
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(preciosRecursivos, 0);

        entrada.close();
    }

    // ----------------- FUNCIONES -----------------
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        return precio - descuentoAplicado;
    }

    static void imprimirArrayRecursivo(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            imprimirArrayRecursivo(array, indice + 1);
        }
    }

}







////