/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author Daniela Bonetti
 */
public class Propietario {
    
    private String nombre;
    private int dni;
    
    private Computadora computadora; // relación bidireccional
    
    public Propietario(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

   @Override
public String toString() {
    return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    // Quitamos computadora para evitar bucle
}

}
