package chainOfResponsibility;

public class BatAttackHandler extends AbstractAttackHandler {
    public BatAttackHandler(AttackHandler next) {
        super(next);
    }

    public void handleRequest(String enemyType, int damage) {
        if (enemyType.equals("Bat")) {
            System.out.println("Bat attack: " + damage);
        } else {
            System.out.println("Attack isn't handled by BatAttackHandler");
            super.handleRequest(enemyType, damage);
        }
    }
}
