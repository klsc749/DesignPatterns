package factory.abstractFactory.character;

public abstract class Character {
    protected String name;
    protected int level;
    protected int health;
    protected int mana;

    public Character(String name, int level, int health, int mana) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
    }

    public abstract void attack();
    public abstract void useSkill();
}
