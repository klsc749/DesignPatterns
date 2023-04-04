package bridge;

public class SwordWeapon extends Weapon {
    public SwordWeapon(WeaponSkill weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void display() {
        System.out.println("Sword");
    }
}
