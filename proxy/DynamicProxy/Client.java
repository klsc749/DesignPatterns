package proxy.DynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Enemy enemy = new RealEnemy(10, "Enemy");
        DynamicProxyEnemyHandler handler = new DynamicProxyEnemyHandler(enemy, 1);
        Enemy proxy = (Enemy) Proxy.newProxyInstance(
                Enemy.class.getClassLoader(),
                new Class<?>[]{Enemy.class},
                handler);

        proxy.attack();
        proxy.attack();
        System.out.println("Waiting for cooldown...");
        Thread.sleep(1000);
        System.out.println("Cooldown finished!");
        proxy.attack();
    }
}
