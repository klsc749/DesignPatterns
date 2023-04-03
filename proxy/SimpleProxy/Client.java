package proxy.SimpleProxy;

public class Client {
    public static void main(String[] args) {
        RealWeapon realWeapon = new RealWeapon(10);
        ProxyWeapon proxyWeapon = new ProxyWeapon(realWeapon, 5);
        for(int i = 0; i < 6; i++) {
            proxyWeapon.fire();
        }
    }
}
