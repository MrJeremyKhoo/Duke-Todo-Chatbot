package duke.command;
public abstract class Command { 
    abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;
}