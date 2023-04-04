package bridge;

public class Client {
    public static void main(String[] args) {
        WeaponSkill slashSkill = new SlashWeaponSkill();
        WeaponSkill stabSkill = new StabWeaponSkill();
        Weapon sword = new SwordWeapon(slashSkill);
        Weapon axe = new AxeWeapon(stabSkill);
        sword.display();
        sword.useWeapon();
        axe.display();
        axe.useWeapon();
    }
}
