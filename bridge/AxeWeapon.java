package bridge;

public class AxeWeapon extends Weapon {
    public AxeWeapon(WeaponSkill weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void display() {
        System.out.println("Axe");
    }
}
