package mediator;

public abstract class Usuario {
    private String nombre;
    private ChatMediator mediator;

    public Usuario(ChatMediator mediator, String nombre) {
        this.nombre = nombre;
        this.mediator = mediator;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarse(ChatRoom chatRoom) {
        chatRoom.agregarUsuario(this);
    }

    public void enviar(String mensaje) {
        System.out.println(nombre + " envia: " + mensaje);
        mediator.enviar(mensaje, this);
    }

    public void recibir(String mensaje) {
        System.out.println(nombre + " recibe: " + mensaje);
    }

}
