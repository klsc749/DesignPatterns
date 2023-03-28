package factory.abstractFactory.character;

public class ElfCharacter extends Character { 
    public ElfCharacter(String name, int level, int health, int mana) {
        super(name, level, health, mana);
    }

    @Override
    public void attack() {
        System.out.println("ElfCharacter " + name + " attacked.");
    }

    @Override
    public void useSkill() {
        System.out.println("ElfCharacter " + name + " used skill.");
    }
}
