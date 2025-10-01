package iterator;

import java.util.List;

public class AlumnoIterator implements CursoIterator {

    private List<Curso> cursos;
    private int posicion = 0;

    public AlumnoIterator(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public boolean hasNext() {
        return posicion < cursos.size();
    }

    @Override
    public Curso next() {
        return cursos.get(posicion++);
    }

}
