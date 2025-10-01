package strategy;

import java.util.List;

public class PromedioSimple implements CalculoNota {

    @Override
    public Double calcular(List<Double> notas) {
        Double suma = 0.0;

        for(Double nota : notas) {
            suma += nota;
        }

        return suma/notas.size();
    }
}
