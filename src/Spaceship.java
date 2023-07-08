import java.util.ArrayList;
import java.util.List;

class Spaceship {
    private final List<Weapon> weapons;
    private final List<Defense> defenses;

    public Spaceship() {
        weapons = new ArrayList<>();
        defenses = new ArrayList<>();
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
        System.out.println("Added weapon: " + weapon.name());
    }

    public void removeWeapon(Weapon weapon) {
        weapons.remove(weapon);
        System.out.println("Removed weapon: " + weapon.name());
    }

    public void addDefense(Defense defense) {
        defenses.add(defense);
        System.out.println("Added defense: " + defense.name());
    }

    public void removeDefense(Defense defense) {
        defenses.remove(defense);
        System.out.println("Removed defense: " + defense.name());
    }

    public void printStatus() {
        System.out.println("Current spaceship status:");
        System.out.println("Weapons: " + weapons);
        System.out.println("Defenses: " + defenses);
    }
}
