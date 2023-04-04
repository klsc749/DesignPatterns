package templateMethod;

public abstract class PlayerCharater {
    public abstract void selectWeapon();
    public abstract void aimWeapon(String enemy);
    public abstract void useWeapon(String enemy);
    public final void attack(String enemy){
        selectWeapon();
        aimWeapon(enemy);
        useWeapon(enemy);
    }
}
