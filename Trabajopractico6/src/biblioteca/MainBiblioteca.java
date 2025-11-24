/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Daniela Bonetti
 */

import java.util.List;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca("Biblioteca Central");

        // 2) Crear autores
        Autor a1 = new Autor("A01", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A02", "Jane Austen", "Inglesa");
        Autor a3 = new Autor("A03", "J.K. Rowling", "Británica");

        // 3) Agregar libros
        bib.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, a1);
        bib.agregarLibro("ISBN002", "Orgullo y Prejuicio", 1813, a2);
        bib.agregarLibro("ISBN003", "Harry Potter y la Piedra Filosofal", 1997, a3);
        bib.agregarLibro("ISBN004", "Relato Corto Ej", 1997, a1);
        bib.agregarLibro("ISBN005", "Libro Ejemplo", 2020, a2);

        // 4) Listar todos
        System.out.println("== Todos los libros ==");
        bib.listarLibros();

        // 5) Buscar por ISBN
        System.out.println("\n== Buscar ISBN003 ==");
        Libro encontrado = bib.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) encontrado.mostrarInfo();

        // 6) Filtrar por año
        System.out.println("\n== Filtrar por año 1997 ==");
        List<Libro> anio1997 = bib.filtrarLibrosPorAnio(1997);
        for (Libro l : anio1997) l.mostrarInfo();

        // 7) Eliminar un libro
        System.out.println("\n== Eliminar ISBN005 ==");
        bib.eliminarLibro("ISBN005");
        bib.listarLibros();

        // 8) Cantidad total de libros
        System.out.println("\n== Cantidad de libros = " + bib.obtenerCantidadLibros());

        // 9) Mostrar autores disponibles
        System.out.println("\n== Autores disponibles ==");
        bib.mostrarAutoresDisponibles();
    }
}
