package chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        AttackHandler zombieAttackHandler = new ZombieAttackHandler(null);
        zombieAttackHandler.setNext(new BatAttackHandler(null)).setNext(new SkeletonAttacHandler(null));

        zombieAttackHandler.handleRequest("Zombie", 10);
        zombieAttackHandler.handleRequest("Bat", 20);
        zombieAttackHandler.handleRequest("Skeleton", 30);
    }
}
