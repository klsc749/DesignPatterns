package proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyEnemyHandler implements InvocationHandler {
    private Enemy enemy;
    private long lastAttackTime;
    private final long coolDown;

    public DynamicProxyEnemyHandler(Enemy enemy, long coolDown) {
        this.enemy = enemy;
        this.coolDown = coolDown;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("attack")) {
            if (System.currentTimeMillis() - lastAttackTime < coolDown) {
                System.out.println("Attack is on cooldown!");
            } else {
                method.invoke(enemy, args);
                lastAttackTime = System.currentTimeMillis();
            }
        } else {
            return method.invoke(enemy, args);
        }
        return null;
    }
}
