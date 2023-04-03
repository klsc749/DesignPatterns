package proxy.SimpleProxy;

public class RealWeapon implements Weapon {
    private int damage;

    public RealWeapon(int damage) {
        this.damage = damage;
    }

    @Override
    public void fire() {
        System.out.println("Firing weapon with damage " + damage);
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
