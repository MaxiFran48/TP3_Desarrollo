package mediator;

public interface ChatMediator {
    void enviar(String msg, Usuario u);

    void agregarUsuario(Usuario usuario);
}
