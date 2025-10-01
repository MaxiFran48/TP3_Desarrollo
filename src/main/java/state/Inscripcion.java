package state;

public class Inscripcion {
    private EstadoInscripcion estado;

    public Inscripcion() {
        estado = new EnEspera();
        System.out.println("Inscripcion iniciada, colocada en espera");
    }

    public EstadoInscripcion getEstado() {
        return estado;
    }

    public void setEstado(EstadoInscripcion estado) {
        this.estado = estado;
    }

    public void completarInscripcion() {
        estado.completarInscripcion(this);
    }

    public void cancelarInscripcion() {
        estado.cancelarInscripcion(this);
    }
}
