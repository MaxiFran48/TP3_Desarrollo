package state;

public class EnEspera implements EstadoInscripcion {

    @Override
    public void completarInscripcion(Inscripcion inscripcion) {
        System.out.println("Inscripcion completada");
        inscripcion.setEstado(new Inscripto());
    }

    @Override
    public void cancelarInscripcion(Inscripcion inscripcion) {
        System.out.println("Cancelando inscripcion");
        inscripcion.setEstado(new Cancelado());
    }
}
