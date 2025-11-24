/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Daniela Bonetti
 */


import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) if (p.getId().equalsIgnoreCase(id)) return p;
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null) {
            System.out.println("Curso no encontrado: " + codigoCurso);
            return;
        }
        if (p == null) {
            System.out.println("Profesor no encontrado: " + idProfesor);
            return;
        }
        c.setProfesor(p); // setProfesor ya sincroniza los dos lados
    }

    public void listarProfesores() {
        System.out.println("Profesores:");
        for (Profesor p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        System.out.println("Cursos:");
        for (Curso c : cursos) c.mostrarInfo();
    }

    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().getCursos().remove(c);
                c.setProfesor(null);
            }
            cursos.remove(c);
            return true;
        }
        return false;
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // dejar null los cursos que dictaba
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p);
            return true;
        }
        return false;
    }

    public void reporteCantidadCursosPorProfesor() {
        System.out.println("Reporte: Cantidad de cursos por profesor");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " -> " + p.getCursos().size() + " cursos");
        }
    }
}
