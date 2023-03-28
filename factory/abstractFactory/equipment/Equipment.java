package factory.abstractFactory.equipment;

public abstract class Equipment {
    protected String name;
    protected int attack;
    protected int defense;

    public Equipment(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public abstract void showInfo();
}
