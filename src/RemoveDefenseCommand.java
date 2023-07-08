class RemoveDefenseCommand implements Command {
    private final Spaceship spaceship;
    private final Defense defense;

    public RemoveDefenseCommand(Spaceship spaceship, Defense defense) {
        this.spaceship = spaceship;
        this.defense = defense;
    }

    public void execute() {
        spaceship.removeDefense(defense);
    }

    public void unexecute() {
        spaceship.addDefense(defense);
    }
}
