package bridge;

public abstract class Weapon {
    private WeaponSkill weaponSkill;
    public Weapon(WeaponSkill weaponSkill) {
        this.weaponSkill = weaponSkill;
    }

    public void useWeapon(){
        weaponSkill.useSkill();
    }

    public abstract void display();
}
