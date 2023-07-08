class AddDefenseCommand implements Command {
    private final Spaceship spaceship;
    private final Defense defense;

    public AddDefenseCommand(Spaceship spaceship, Defense defense) {
        this.spaceship = spaceship;
        this.defense = defense;
    }

    public void execute() {
        spaceship.addDefense(defense);
    }

    public void unexecute() {
        spaceship.removeDefense(defense);
    }
}
