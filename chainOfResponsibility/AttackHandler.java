package chainOfResponsibility;

public interface AttackHandler {
    public AttackHandler setNext(AttackHandler handler);
    public void handleRequest(String enemyType, int damage);
}
