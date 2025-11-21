/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author Daniela Bonetti
 */
import empleados.EmpleadoPlanta;
import empleados.Empleado;
import java.util.*;

public class Kata3 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 150000));
        empleados.add(new EmpleadoTemporal("Luis", 80, 2000));

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.nombre);
            System.out.println("Sueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("→ Es empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("→ Es empleado temporal");
            }

            System.out.println();
        }
    }
}