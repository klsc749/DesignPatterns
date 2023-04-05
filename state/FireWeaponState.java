package state;

public class FireWeaponState implements WeaponState {
          
        @Override
        public void switchTo(WeaponState weaponState, Weapon weapon) {
            if(weaponState instanceof FireWeaponState) {
                System.out.println("Already in fire state");
            }
            weapon.setWeaponState(weaponState);
        }
    
        @Override
        public void attack() {
            System.out.println("Fire attack");
        }
}
