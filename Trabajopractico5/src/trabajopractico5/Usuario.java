/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author Daniela Bonetti
 */
public class Usuario {
    
    private String nombre;
    private int dni;
    
    private Celular celular;
    
    public Usuario(String nombre, int dni){
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

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

   @Override
public String toString() {
    return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    // Quitamos celular para evitar bucle
}

    
}