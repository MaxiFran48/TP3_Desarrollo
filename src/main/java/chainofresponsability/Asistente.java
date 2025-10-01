package chainofresponsability;

public class Asistente extends Handler {

    public boolean procesar(Solicitud solicitud) {
        if (solicitud.getNivel() <= 1) {
            System.out.println("El asistente ha procesado la solicitud correctamente");
            return true;
        }
        return false;
    }
}
