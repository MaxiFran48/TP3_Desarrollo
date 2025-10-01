package state;

public class Cancelado implements EstadoInscripcion {

    @Override
    public void completarInscripcion(Inscripcion inscripcion) {
        System.out.println("Lo sentimos, esta inscripcion ya fue cancelada");
    }

    @Override
    public void cancelarInscripcion(Inscripcion inscripcion) {
        System.out.println("Esta inscripcion ya esta cancelada");
    }
}
