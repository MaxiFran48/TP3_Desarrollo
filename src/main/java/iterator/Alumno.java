package iterator;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private int legajo;
    private List<Curso> cursos = new ArrayList<>();

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void eliminarCurso(Curso curso) {
        cursos.remove(curso);
    }

    public CursoIterator iterator() {
        return new AlumnoIterator(cursos);
    }

}
