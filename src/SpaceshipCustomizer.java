import java.util.ArrayList;
import java.util.List;

class SpaceshipCustomizer {
    private final List<Command> executedCommands;

    public SpaceshipCustomizer() {
        executedCommands = new ArrayList<>();
    }

    public void addWeapon(Spaceship spaceship, Weapon weapon) {
        Command command = new AddWeaponCommand(spaceship, weapon);
        command.execute();
        executedCommands.add(command);
    }

    public void removeWeapon(Spaceship spaceship, Weapon weapon) {
        Command command = new RemoveWeaponCommand(spaceship, weapon);
        command.execute();
        executedCommands.add(command);
    }

    public void addDefense(Spaceship spaceship, Defense defense) {
        Command command = new AddDefenseCommand(spaceship, defense);
        command.execute();
        executedCommands.add(command);
    }

    public void removeDefense(Spaceship spaceship, Defense defense) {
        Command command = new RemoveDefenseCommand(spaceship, defense);
        command.execute();
        executedCommands.add(command);
    }

    public void undoLastCommand() {
        if (executedCommands.size() > 0) {
            Command lastCommand = executedCommands.remove(executedCommands.size() - 1);
            lastCommand.unexecute();
        }
    }
}
