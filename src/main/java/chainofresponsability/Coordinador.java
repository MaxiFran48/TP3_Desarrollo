package chainofresponsability;

public class Coordinador extends Handler {
    public boolean procesar(Solicitud solicitud) {
        if (solicitud.getNivel() >= 3) {
            System.out.println("El coordinador ha procesado la solicitud correctamente");
            return true;
        }
        return false;
    }

}
