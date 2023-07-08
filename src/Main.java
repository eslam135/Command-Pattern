
public class Main {
    public static void main(String[] args) {
        Spaceship spaceship = new Spaceship();
        SpaceshipCustomizer customizer = new SpaceshipCustomizer();

        Weapon laser = new Weapon("Laser");
        Weapon missile = new Weapon("Missile");

        Defense shield = new Defense("Shield");
        Defense armor = new Defense("Armor");

        customizer.addWeapon(spaceship, laser);
        customizer.addWeapon(spaceship, missile);
        customizer.undoLastCommand();

        customizer.addDefense(spaceship, shield);
        customizer.addDefense(spaceship, armor);
        customizer.undoLastCommand();

        customizer.removeWeapon(spaceship, laser);
        customizer.removeDefense(spaceship, shield);

        spaceship.printStatus();
    }
}