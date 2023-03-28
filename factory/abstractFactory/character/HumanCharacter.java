package factory.abstractFactory.character;

public class HumanCharacter extends Character {
    public HumanCharacter(String name, int level, int health, int mana) {
        super(name, level, health, mana);
    }

    @Override
    public void attack() {
        System.out.println("HumanCharacter " + name + " attacked.");
    }

    @Override
    public void useSkill() {
        System.out.println("HumanCharacter " + name + " used skill.");
    }
}
