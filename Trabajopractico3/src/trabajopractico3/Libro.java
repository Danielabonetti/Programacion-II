/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author Daniela Bonetti
 */

public class Libro {
    private String titulo = "Torre Oscura";
    private String autor = "King";
    private int anioPublicacion = 2005;

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setters
    public void setTitulo(String nuevoTitulo) {
        if (nuevoTitulo.equalsIgnoreCase("")) {
            System.out.println("El título no puede estar vacío");
        } else {
            titulo = nuevoTitulo;
        }
    }

    public void setAutor(String nuevoAutor) {
        autor = nuevoAutor;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio < 0) {
            System.out.println("Año inválido");
        } else {
            anioPublicacion = nuevoAnio;
        }
    }
}
