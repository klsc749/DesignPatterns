package strategy;

public class SpecialAttack implements EnemyAttackStrategy {
    @Override
    public void attack(Player player) {
        System.out.println("Special attack!");
        player.takeDamage(20);
    }
}
