package state;

public interface WeaponState {
    public void switchTo(WeaponState weaponState, Weapon weapon);
    public void attack();
}
