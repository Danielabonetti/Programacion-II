/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package trabajopractico3;

/* @author Daniela Bonetti */
public class Trabajopractico3 {

    public static void main(String[] args) {

        // Crear objetos de tipo Estudiante
        Estudiante pepito = new Estudiante(); // usa valores por defecto
        Estudiante juancito = new Estudiante("Juancito", "Perez", "B", 55.2f); // valores personalizados

        // Mostrar información de los estudiantes
        System.out.println("--- Datos de Pepito ---");
        pepito.mostrarInfo();

        System.out.println("--- Datos de Juancito ---");
        juancito.mostrarInfo();

        // Llamar a los métodos de Pepito
        System.out.println("\n--- Subir calificación de Pepito en 10 puntos ---");
        pepito.subirCalificacion(10);
        pepito.mostrarInfo();

        System.out.println("\n--- Bajar calificación de Pepito en 10 puntos ---");
        pepito.bajarCalificacion(10);
        pepito.mostrarInfo();
    }
}



//Una vez tengo la clase definida, creo un objeto de tipo Estudiante
//la pregunta es como lo creo? //tipos_de_dato (que es el nombre de nuestra clase) 
//nombreDelObjeto //el operador =, seguido del operador new y nuevamente nombre de la clase 
//seguido de () estudiante pepito = new estudiante(); estudiante juancito = new estudiante();
//Si yo quiero acceder a los atributos o metodo que estan dentro del objeto
//lo que debo hacer es: usar el nombre del objeto, seguido de un punto,
// y seguido de lo que yo quiera usar, que este definido en la clase 
//osea: nombreObjeto.algo

