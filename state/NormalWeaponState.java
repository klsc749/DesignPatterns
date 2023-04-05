package state;

public class NormalWeaponState implements WeaponState {

    @Override
    public void switchTo(WeaponState weaponState, Weapon weapon) {
        if(weaponState instanceof NormalWeaponState) {
            System.out.println("Already in normal state");
        }
        weapon.setWeaponState(weaponState);
    }

    @Override
    public void attack() {
        System.out.println("Normal attack");
    }
     
}
