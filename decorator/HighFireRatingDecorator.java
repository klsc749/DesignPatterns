package decorator;

public class HighFireRatingDecorator extends Decorator {

    public HighFireRatingDecorator(Weapon weapon) {
        super(weapon);
    }
    
    @Override
    public int getDamage() {
        return weapon.getDamage();
    }
    
    @Override
    public int getFireRating() {
        return weapon.getFireRating() + 10;
    }
    
}
