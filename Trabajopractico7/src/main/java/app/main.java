/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Daniela Bonetti
 */


import vehiculos.Auto;
import figuras.Figura;
import figuras.Circulo;
import figuras.Rectangulo;
import empleados.Empleado;
import empleados.EmpleadoPlanta;
import empleados.EmpleadoTemporal;
import animales.Animal;
import animales.Perro;
import animales.Gato;
import animales.Vaca;

public class main {
    public static void main(String[] args) {
        
        System.out.println("=== KATA 1: VEHÍCULOS ===");
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();
        
        
        System.out.println("\n=== KATA 2: FIGURAS ===");
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6)
        };
        
        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " - Área: " + f.calcularArea());
        }
        
        
        System.out.println("\n=== KATA 3: EMPLEADOS ===");
        Empleado[] empleados = {
            new EmpleadoPlanta("Ana", 300000),
            new EmpleadoTemporal("Luis", 800, 25)
        };
        
        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Sueldo: " + e.calcularSueldo());
            
            if (e instanceof EmpleadoPlanta) {
                System.out.println("→ Es empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("→ Es empleado temporal");
            }
        }
        
        
        System.out.println("\n=== KATA 4: ANIMALES ===");
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca()
        };
        
        for (Animal a : animales) {
            System.out.println(a.describirAnimal());
            System.out.println("Sonido: " + a.hacerSonido());
        }
    }
}
