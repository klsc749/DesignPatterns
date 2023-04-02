package adapter;

public class Pistol implements Weapon {
    private int ammoCount = 10;
    
    @Override
    public void fire() {
        if (ammoCount > 0) {
            System.out.println("Pew!");
            ammoCount--;
        } else {
            System.out.println("Click!");
        }
    }
    
    @Override
    public int getAmmoCount() {
        return ammoCount;
    }
}
