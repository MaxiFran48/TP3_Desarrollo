package state;

public class Inscripto implements EstadoInscripcion {

    @Override
    public void completarInscripcion(Inscripcion inscripcion) {
        System.out.println("La inscripcion ya esta finalizada");
    }

    @Override
    public void cancelarInscripcion(Inscripcion inscripcion) {
        System.out.println("Inscripcion cancelada");
        inscripcion.setEstado(new Cancelado());
    }
}
