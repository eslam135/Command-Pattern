// The Command interface declares methods for executing and undoing a command.
interface Command {
    void execute();

    void unexecute();
}
