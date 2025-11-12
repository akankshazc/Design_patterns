package hf_6.undo;

public interface Command {
    public void execute();

    public void undo();
}
