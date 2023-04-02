package decorator;

public abstract class Decorator implements Weapon {
    protected Weapon weapon;
    
    public Decorator(Weapon weapon) {
        this.weapon = weapon;
    }
    
    @Override
    public int getDamage() {
        return weapon.getDamage();
    }
    
    @Override
    public int getFireRating() {
        return weapon.getFireRating();
    }
    
}
