package strategy;

import java.util.List;

public class AlumnoStrategy {
    private CalculoNota calculoNota;

    public AlumnoStrategy(CalculoNota calculoNota) {
        this.calculoNota = calculoNota;
    }

    public void setCalculoNota(CalculoNota calculoNota) {
        this.calculoNota = calculoNota;
    }

    public void calcularNota(List<Double> notas) {
        System.out.println("Nota final: " + calculoNota.calcular(notas));
    }

}
