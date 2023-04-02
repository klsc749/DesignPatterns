package adapter;

public class LaserGun {
    int batteryLevel = 100;

    public void pewpew(){
        if (batteryLevel > 0) {
            System.out.println("Pew!");
            batteryLevel--;
        } else {
            System.out.println("Click!");
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
