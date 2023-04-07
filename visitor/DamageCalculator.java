package visitor;

public class DamageCalculator implements CharacterVisitor {
    private Character attacker;

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    
    public int calculateDamage() {
        int damage = attacker.getAttackPower();
        
        return damage;
    }

    @Override
    public void visit(Witcher witcher) {
        int damage = calculateDamage();
        int health = witcher.getHealth();
        health -= damage;
        witcher.setHealth(health);
    }

    @Override
    public void visit(Human human) {
        int damage = calculateDamage();
        int health = human.getHealth();
        health -= damage;
        human.setHealth(health);
    }
}
