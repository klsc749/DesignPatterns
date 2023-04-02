package decorator;

public class BaseWeapon implements Weapon {

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public int getFireRating() {
        return 1;
    }
    
}
