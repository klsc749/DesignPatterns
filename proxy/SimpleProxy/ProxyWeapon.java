package proxy.SimpleProxy;

public class ProxyWeapon implements Weapon {
    private RealWeapon realWeapon;
    private int ammo;

    public ProxyWeapon(RealWeapon realWeapon, int ammo) {
        this.ammo = ammo;
        this.realWeapon = realWeapon;
    }

    @Override
    public void fire() {
        if (ammo > 0) {
            realWeapon.fire();
            ammo--;
        } else {
            System.out.println("Out of ammo");
        }
    }

    @Override
    public int getDamage() {
        return realWeapon.getDamage();
    }
}
