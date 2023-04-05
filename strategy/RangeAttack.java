package strategy;

public class RangeAttack implements EnemyAttackStrategy {
    @Override
    public void attack(Player player) {
        System.out.println("Range attack!");
        player.takeDamage(10);
    }
}