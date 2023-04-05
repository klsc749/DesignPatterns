package chainOfResponsibility;

public abstract class AbstractAttackHandler implements AttackHandler {
    private AttackHandler next;

    public AbstractAttackHandler(AttackHandler next) {
        this.next = next;
    }

    public AttackHandler setNext(AttackHandler handler) {
        this.next = handler;
        return handler;
    }

    public void handleRequest(String enemyType, int damage) {
        if (next != null) {
            next.handleRequest(enemyType, damage);
        }
    }
}