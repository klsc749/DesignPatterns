package chainOfResponsibility;

public class ZombieAttackHandler extends AbstractAttackHandler {
    public ZombieAttackHandler(AttackHandler next) {
        super(next);
    }

    public void handleRequest(String enemyType, int damage) {
        if (enemyType.equals("Zombie")) {
            System.out.println("Zombie attack: " + damage);
        } else {
            System.out.println("Attack isn't handled by ZombieAttackHandler");
            super.handleRequest(enemyType, damage);
        }
    }
}
