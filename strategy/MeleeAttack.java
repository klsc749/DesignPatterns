package strategy;

public class MeleeAttack implements EnemyAttackStrategy {
    @Override
    public void attack(Player player) {
        System.out.println("Melee attack!");
        player.takeDamage(10);
    }
}
