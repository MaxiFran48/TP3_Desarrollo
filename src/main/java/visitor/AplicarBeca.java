package visitor;

public class AplicarBeca implements Visitor {

    @Override
    public void visitar(AlumnoBecado a) {
        System.out.println("Beneficios para el alumno " + a.getName() + ": Cuota cubierta por la universidad");
    }

    @Override
    public void visitar(AlumnoRegular a) {
        System.out.println("Beneficios para el alumno " + a.getName() + ": Ninguno");
    }

}
