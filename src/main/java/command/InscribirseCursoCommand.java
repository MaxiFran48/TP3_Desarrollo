package command;

public class InscribirseCursoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Inscripcion a curso realizada");
    }

    @Override
    public void undo() {
        System.out.println("Inscripcion a curso cancelada");
    }
}
