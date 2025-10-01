package chainofresponsability;

public class Solicitud {
    private String mensaje;
    private int nivel;

    public Solicitud(String mensaje, int nivel) {
        this.mensaje = mensaje;
        this.nivel = nivel;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

