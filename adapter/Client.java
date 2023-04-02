package adapter;

public class Client {
    public static void main(String[] args) {
        Weapon[] weapons = new Weapon[2];
        weapons[0] = new Pistol();
        weapons[1] = new LaserGunAdapter(new LaserGun());
        
        for (Weapon weapon : weapons) {
            weapon.fire();
            System.out.println("Ammo count: " + weapon.getAmmoCount());
        }
    }
}
