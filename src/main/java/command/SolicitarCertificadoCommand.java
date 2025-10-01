package command;

public class SolicitarCertificadoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Solicitud de certificado enviada");
    }

    @Override
    public void undo() {
        System.out.println("Solicitud de certificado cancelada");
    }
}
