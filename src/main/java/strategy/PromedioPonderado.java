package strategy;

import java.util.List;

public class PromedioPonderado implements CalculoNota {

    @Override
    public Double calcular(List<Double> notas) {

        return (notas.get(0)*0.25 + notas.get(1)*0.25 + notas.get(2)*0.50);

    }
}
