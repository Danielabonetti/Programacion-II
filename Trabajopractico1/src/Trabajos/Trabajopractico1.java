/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Trabajos;

import java.util.Scanner;

 /*
 * @author Daniela Bonetti
 */
public class Trabajopractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----  TP 1 - introduccion Java ----");
         // EJERCICIO 2
        System.out.println("--- Ejercicio 2 ---");
        System.out.println("¡Hola java!");

          
        System.out.println("---  Ejercicio 3 ---");
        String nombre = "Ezequiel";
        int edad = 32;
        double altura = 1.72;
        boolean estudiante = true;

        System.out.println("El nombre es: " + nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(estudiante);

        System.out.println("---  Ejercicio 4 ---");

        /*
        
        Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
        los muestre en pantalla. Usa Scanner para capturar los datos.
        
        
         */
        //teoria: Existen una serie de mecanismos que permiten que un usuario que
        //ingrese informacion o datos, a un software
        //ese dato, se almacenara en una variable u otra estructra de almacenamiento
        //Scanner
        Scanner entrada = new Scanner(System.in);
        
        String nombreEjercicio4;
        int edadEjercicio4;
        String nacionalidad;
        
        System.out.print("Introduce un nombre: ");
        nombreEjercicio4 = entrada.nextLine();
        
        System.out.print("Introduce un edad: ");
        edadEjercicio4 = entrada.nextInt();
        
        //Despues de usar un nextInt, nextFloat, etc
        //lo que ocurre en la entrada de datos, es que se deja \n
        //solucion:
        entrada.nextLine();
        
        System.out.print("Introduce tu nacionalidad: ");
        nacionalidad = entrada.nextLine();
        
        System.out.println("El nombre de la persona es: "+nombreEjercicio4);
        System.out.println("El edad de la persona es: "+edadEjercicio4);
         System.out.println("La nacionalidad de la persona es: "+nacionalidad);
         
          System.out.print("---Ejercicio 5 ---");
        
        
        //1- Declaramos las variables
        int numero1;
        int numero2;
        
        //2- Entrada de datos
   
        System.out.print("Introduce un primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Introduce un segundo numero: ");
        numero2 = entrada.nextInt();
        
        //operadores: son simbolos que permiten realizar operaciones o acciones
        //con datos, generalmente con dos datos
        
        //Operadores aritmeticos
        //Operadores asignacion
        //Operadores de comparacion
        //Operadores de logicos
        
        // --- Operadores matematicos ---
        //+,-,*,/ %(resto de la division), ++ (incremento), -- (decremento)
        
        System.out.println("La suma es: "+(numero1+numero2));
        
        //si el operador + tiene un string y un valor u otro string
        //concatena
        
        //si tiene dos numeros, suma
        
        System.out.println("La resta es: "+(numero1-numero2));
        System.out.println("La multiplicacion es: "+(numero1*numero2));
        System.out.println("La division es: "+(numero1/numero2));
        
        
        
       System.out.println("--- Ejercicio 6 ---");

/*
Escribe un programa que muestre el siguiente mensaje en consola:

Nombre: Juan Pérez
Edad: 30 años
Dirección: "Calle Falsa 123"

Usa caracteres de escape (\n, \") en System.out.println().
*/

System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
        
        
        System.out.println("--- Ejercicio 7 ---");
        
        
        System.out.println("Analisis de expresiones e instrucciones:");
        System.out.println("int x = 10; // expresion");
        System.out.println("x = x + 5; // instruccion");
        System.out.println("System.out.println(x); // instruccion");
        System.out.println("Diferencia: Una expresion produce un valor, una instruccion realiza una accion.");
        
        
        System.out.print("---Ejercicio 8 ---\n");
        
         //1- Declaramos las variables
        int valor1;
        int valor2;
        int resultadoDivision;
        
        //2- Entrada de datos
        System.out.print("Introduce un primer numero: ");
        valor1 = entrada.nextInt();
        
        System.out.print("Introduce un segundo numero: ");
        valor2 = entrada.nextInt();
        
        resultadoDivision = valor1/valor2;
        
        System.out.println("El resultado de la division es: "+resultadoDivision);
        
        
        double valor1Double = valor1;
        double valor2Double = valor2;
        double resultadoDivisionDouble;

        resultadoDivisionDouble = valor1Double/valor2Double;
        
        System.out.println("El resultado de la division es: "+resultadoDivisionDouble);
        
        
        System.out.println("--- Ejercicio 9 ---");
        
        entrada.nextLine();
        // limpiar buffer
        
        
        System.out.print("Ingresa tu nombre: ");
        String nombreCorregido = entrada.nextLine();
        System.out.println("Hola, " + nombreCorregido);
        System.out.println("Error original: se intentaba leer un String con nextInt(), lo corregimos usando nextLine()");
        
        System.out.print("---Ejercicio 10 ---\n");
        
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
        
        
       //a | b | resultado
       //5 | 2 | 2 (porque es división entera)
       
        
        
        
    }
}

        // TODO code application logic here
    
    
