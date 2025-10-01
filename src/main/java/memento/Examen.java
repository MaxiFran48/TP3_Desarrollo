package memento;

import java.util.*;

public class Examen {

    private Map<String, String> preguntasConRespuestas = new HashMap<>();

    public Memento save() {
        return new Memento(preguntasConRespuestas);
    }

    public void restore(Memento m) {
        preguntasConRespuestas = m.getEstado();
    }

    public void agregarPregunta(String pregunta) {
        preguntasConRespuestas.put(pregunta, "");
    }

    public void responderPregunta(String pregunta, String respuesta) {
        preguntasConRespuestas.put(pregunta, respuesta);
    }

    public List<String> getPreguntas() {
        Set<String> claves = preguntasConRespuestas.keySet();
        return new ArrayList<>(claves);
    }

    public Map<String, String> getPreguntasConRespuestas() {
        return preguntasConRespuestas;
    }

}
