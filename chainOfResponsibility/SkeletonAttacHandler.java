package chainOfResponsibility;

public class SkeletonAttacHandler extends AbstractAttackHandler {
    public SkeletonAttacHandler(AttackHandler next) {
        super(next);
    }

    public void handleRequest(String enemyType, int damage) {
        if (enemyType.equals("Skeleton")) {
            System.out.println("Skeleton attack: " + damage);
        } else {
            System.out.println("Attack isn't handled by SkeletonAttacHandler");
            super.handleRequest(enemyType, damage);
        }
    }
}
