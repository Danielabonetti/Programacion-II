/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad;

/**
 *
 * @author Daniela Bonetti
 */


public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Ejemplo");

        // 1) Crear profesores y cursos
        Profesor prof1 = new Profesor("PR01", "Dr. Martín", "Matemáticas");
        Profesor prof2 = new Profesor("PR02", "Dra. Gómez", "Programación");
        Profesor prof3 = new Profesor("PR03", "Lic. Pérez", "Física");

        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "Programación I");
        Curso c3 = new Curso("C003", "Física I");
        Curso c4 = new Curso("C004", "Estructuras de Datos");
        Curso c5 = new Curso("C005", "Bases de Datos");

        // 2) Agregar a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3) Asignar profesores a cursos
        uni.asignarProfesorACurso("C001", "PR01");
        uni.asignarProfesorACurso("C002", "PR02");
        uni.asignarProfesorACurso("C004", "PR02");
        uni.asignarProfesorACurso("C003", "PR03");

        // 4) Listar
        System.out.println("== Listado inicial ==");
        uni.listarProfesores();
        uni.listarCursos();

        // 5) Cambiar profesor de un curso
        System.out.println("\n== Reasignar C002 a PR03 ==");
        uni.asignarProfesorACurso("C002", "PR03");
        uni.listarProfesores();
        uni.listarCursos();

        // 6) Remover un curso
        System.out.println("\n== Eliminar curso C005 ==");
        uni.eliminarCurso("C005");
        uni.listarCursos();

        // 7) Remover un profesor
        System.out.println("\n== Eliminar profesor PR01 ==");
        uni.eliminarProfesor("PR01");
        uni.listarProfesores();
        uni.listarCursos();

        // 8) Reporte cantidad de cursos por profesor
        System.out.println("\n== Reporte final ==");
        uni.reporteCantidadCursosPorProfesor();
    }
}

