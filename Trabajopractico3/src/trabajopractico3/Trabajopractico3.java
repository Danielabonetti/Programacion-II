/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package trabajopractico3;

public class Trabajopractico3 {

    public static void main(String[] args) {
        
        // ----------------- EJERCICIO 1: Registro de Estudiantes -----------------
        System.out.println("--- Ejercicio 1: Estudiantes ---");
        Estudiante pepito = new Estudiante();
        pepito.mostrarInfo();
        pepito.subirCalificacion(10);
        pepito.mostrarInfo();
        pepito.bajarCalificacion(5);
        pepito.mostrarInfo();

        Estudiante juancito = new Estudiante();
        juancito.nombre = "Juancito";
        juancito.apellido = "Perez";
        juancito.curso = "B";
        juancito.calificacion = 55.2f;
        juancito.mostrarInfo();

        // ----------------- EJERCICIO 2: Registro de Mascotas -----------------
        System.out.println("\n--- Ejercicio 2: Mascotas ---");
        Mascota perro = new Mascota();
        perro.nombre = "Firulais";
        perro.especie = "Perro";
        perro.edad = 3;
        perro.mostrarInfo();
        perro.cumplirAnios();
        perro.mostrarInfo();

        // ----------------- EJERCICIO 3: Encapsulamiento con Libro -----------------
        System.out.println("\n--- Ejercicio 3: Libro ---");
        Libro libroUno = new Libro();
        System.out.println("Título: " + libroUno.getTitulo());
        libroUno.setTitulo("El Señor de los Anillos");
        System.out.println("Título actualizado: " + libroUno.getTitulo());

        libroUno.setAnioPublicacion(-555); // inválido
        libroUno.setAnioPublicacion(1954); // válido
        System.out.println("Año de publicación: " + libroUno.getAnioPublicacion());

        // ----------------- EJERCICIO 4: Gestión de Gallinas -----------------
        System.out.println("\n--- Ejercicio 4: Gallinas ---");
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);

        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarEstado();

        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.mostrarEstado();
    }
}
