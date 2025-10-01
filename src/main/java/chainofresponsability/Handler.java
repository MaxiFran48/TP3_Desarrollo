package chainofresponsability;

public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(Solicitud solicitud) {
        if (!procesar(solicitud) && next != null) {
            next.handle(solicitud);
        }

    }

    public abstract boolean procesar(Solicitud solicitud);

}


