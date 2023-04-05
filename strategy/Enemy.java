package strategy;

public class Enemy {
    private String name;
    private EnemyAttackStrategy attackStrategy;
    
    public Enemy(String name, EnemyAttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAttackStrategy(EnemyAttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    
    public void attack(Player player) {
        attackStrategy.attack(player);
    }
    
}
