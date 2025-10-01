package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void enviar(String msg, Usuario u) {
        for (Usuario usuario : usuarios) {
            if (usuario != u) {
                usuario.recibir(msg);
            }
        }
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
