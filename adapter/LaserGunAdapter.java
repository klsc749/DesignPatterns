package adapter;

public class LaserGunAdapter implements Weapon {
    private LaserGun laserGun;
    
    public LaserGunAdapter(LaserGun laserGun) {
        this.laserGun = laserGun;
    }
    
    @Override
    public void fire() {
        laserGun.pewpew();
    }
    
    @Override
    public int getAmmoCount() {
        return laserGun.getBatteryLevel();
    }
}
