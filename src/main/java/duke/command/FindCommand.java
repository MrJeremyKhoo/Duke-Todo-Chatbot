package duke.command;
import duke.*;
import duke.task.*;
import java.util.List;
public class FindCommand extends Command { 
    private List<String> arg;

    public FindCommand(List<String> arg) {
        this.arg = arg;
    }
    public String execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        if (this.arg.size() > 1) {
            throw new DukeException("only seaches by ONE keyword");
        }
        return taskList.find(arg.get(0));
    }
}
