package memento;

import java.util.Stack;

public class Historial {
    Stack<Memento> historial = new Stack<>();

    public void guardar(Memento m) {
        historial.push(m);
    }

    public Memento deshacer() {
        if(historial.isEmpty()){
            return null;
        } else {
            return historial.pop();
        }
    }
}
