package observer;

import java.util.ArrayList;
import java.util.List;

public class CursoObserver implements Subject {
    private List<Observer> alumnos = new ArrayList<>();
    private String horarios;
    private String nombre;

    public CursoObserver(String nombre, String horarios) {
        this.horarios = horarios;
        this.nombre = nombre;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
        notifyObservers();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void addObserver(Observer o) {
        alumnos.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        alumnos.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : alumnos) {
            o.update(horarios);
        }
    }
}
