package strategy;

import java.util.List;

public class ExamenExtra implements CalculoNota {

    @Override
    public Double calcular(List<Double> notas) {
        Double suma = 0.0;
        Double notaExamenExtra = 9.0;

        for(Double nota : notas) {
            suma += nota;
        }

        return (suma + notaExamenExtra)/(notas.size()+1);
    }

}
