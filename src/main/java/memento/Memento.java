package memento;

import java.util.HashMap;
import java.util.Map;

public class Memento {
    private final Map<String, String> estado;

    public Memento(Map<String, String> estado) { 
        // Hacer una copia profunda del Map para evitar referencias compartidas
        this.estado = new HashMap<>(estado); 
    }

    public Map<String, String> getEstado() { 
        // Devolver una copia para evitar que se modifique el estado guardado
        return new HashMap<>(estado); 
    }
}
