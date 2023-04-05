package strategy;

public class Client {
    public static void main(String[] args) {
        Player player = new Player(100);
        Enemy enemy = new Enemy("Enemy", new MeleeAttack());
        
        enemy.attack(player);
        enemy.setAttackStrategy(new RangeAttack());
        enemy.attack(player);
        enemy.setAttackStrategy(new SpecialAttack());
        enemy.attack(player);
    }
}
