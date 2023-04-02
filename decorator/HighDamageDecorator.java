package decorator;

public class HighDamageDecorator extends Decorator {

    public HighDamageDecorator(Weapon weapon) {
        super(weapon);
    }
    
    @Override
    public int getDamage() {
        return weapon.getDamage() + 10;
    }
    
    @Override
    public int getFireRating() {
        return weapon.getFireRating();
    }
    
}

