package chainofresponsability;

public class Profesor extends Handler {



    public boolean procesar(Solicitud solicitud) {
        if (solicitud.getNivel() == 2) {
            System.out.println("El profesor ha procesado la solicitud correctamente");
            return true;
        }
        return false;
    }
}
