package state;

public class Client {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.attack();
        weapon.switchTo(new FireWeaponState());
        weapon.attack();
        weapon.switchTo(new IceWeaponState());
        weapon.attack();
        weapon.switchTo(new NormalWeaponState());
        weapon.attack();
        weapon.switchTo(new NormalWeaponState());
        weapon.attack();
    }
}
