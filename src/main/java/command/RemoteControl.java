package command;

// Invoker
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButon() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }

}
