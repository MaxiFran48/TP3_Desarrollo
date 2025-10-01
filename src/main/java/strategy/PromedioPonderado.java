package strategy;

import java.util.List;

public class PromedioPonderado implements CalculoNota {

    @Override
    public Double calcular(List<Double> notas) {
        Double suma = 0.0;

        for(Double nota : notas) {
            suma += nota;
        }

        return Math.ceil(suma/notas.size());
    }
}
