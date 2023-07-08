
class AddWeaponCommand implements Command {
    private final Spaceship spaceship;
    private final Weapon weapon;

    public AddWeaponCommand(Spaceship spaceship, Weapon weapon) {
        this.spaceship = spaceship;
        this.weapon = weapon;
    }

    public void execute() {
        spaceship.addWeapon(weapon);
    }

    public void unexecute() {
        spaceship.removeWeapon(weapon);
    }
}
