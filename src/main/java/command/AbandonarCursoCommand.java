package command;

public class AbandonarCursoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Inscripcion a curso cancelada");
    }

    @Override
    public void undo() {
        System.out.println("Cancelacion de inscripcion suspendida");
    }
}
