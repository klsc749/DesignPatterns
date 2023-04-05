package state;

public class Weapon {
    private WeaponState weaponState;
    
    public Weapon() {
        weaponState = new NormalWeaponState();
    }
    
    public void switchTo(WeaponState weaponState) {
        this.weaponState.switchTo(weaponState, this);
    }
    
    public void attack() {
        weaponState.attack();
    }

    public void setWeaponState(WeaponState weaponState){
        this.weaponState = weaponState;
    }
}
