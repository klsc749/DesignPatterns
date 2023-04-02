package decorator;

public class Client {
    public static void main(String[] args) {
        Weapon weapon = new BaseWeapon();
        System.out.println("Base weapon damage: " + weapon.getDamage());
        System.out.println("Base weapon fire rating: " + weapon.getFireRating());
        
        weapon = new HighDamageDecorator(weapon);
        System.out.println("High damage weapon damage: " + weapon.getDamage());
        System.out.println("High damage weapon fire rating: " + weapon.getFireRating());
        
        weapon = new HighFireRatingDecorator(weapon);
        System.out.println("High fire rate weapon damage: " + weapon.getDamage());
        System.out.println("High fire rate weapon fire rating: " + weapon.getFireRating());
    }
}
