package state;

public class IceWeaponState implements WeaponState{
    @Override
    public void switchTo(WeaponState weaponState, Weapon weapon) {
        if(weaponState instanceof IceWeaponState) {
            System.out.println("Already in ice state");
        }
        weapon.setWeaponState(weaponState);
    }

    @Override
    public void attack() {
        System.out.println("Ice attack");
    }
}
