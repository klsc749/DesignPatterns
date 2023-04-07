package visitor;

public class Witcher implements Character {
    private int health;
    private int attackPower;
    
    public Witcher(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }
    
    @Override
    public void accept(CharacterVisitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public int getHealth() {
        return health;
    }
    
    @Override
    public int getAttackPower() {
        return attackPower;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String toString() {
        return "Witcher [health=" + health + ", attackPower=" + attackPower + "]";
    }
}
