/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/*@author Daniela Bonetti */

public class Estudiante {

    // Atributos
    String nombre;
    String apellido;
    String curso;
    float calificacion;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Pepito";
        this.apellido = "Hernandez";
        this.curso = "A";
        this.calificacion = 78.5f;
    }

    // Constructor con parámetros
    public Estudiante(String nombre, String apellido, String curso, float calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("El curso es: " + curso);
        System.out.println("La calificación es: " + calificacion);
    }

    public void subirCalificacion(float puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(float puntos) {
        calificacion -= puntos;
    }
}

