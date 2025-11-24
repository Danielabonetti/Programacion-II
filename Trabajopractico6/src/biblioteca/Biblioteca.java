/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Daniela Bonetti
 */


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro l = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(l);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) l.mostrarInfo();
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            libros.remove(l);
            return true;
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> res = new ArrayList<>();
        for (Libro l : libros) if (l.getAnioPublicacion() == anio) res.add(l);
        return res;
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores en la biblioteca:");
        // evitar duplicados básicos
        List<String> vistos = new ArrayList<>();
        for (Libro l : libros) {
            String id = l.getAutor().getId();
            if (!vistos.contains(id)) {
                vistos.add(id);
                l.getAutor().mostrarInfo();
            }
        }
    }
}
