class RemoveWeaponCommand implements Command {
    private final Spaceship spaceship;
    private final Weapon weapon;

    public RemoveWeaponCommand(Spaceship spaceship, Weapon weapon) {
        this.spaceship = spaceship;
        this.weapon = weapon;
    }

    public void execute() {
        spaceship.removeWeapon(weapon);
    }

    public void unexecute() {
        spaceship.addWeapon(weapon);
    }
}
