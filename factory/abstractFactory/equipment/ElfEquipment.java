package factory.abstractFactory.equipment;

public class ElfEquipment extends Equipment {
    public ElfEquipment(String name, int attack, int defense) {
        super(name, attack, defense);
    }

    @Override
    public void showInfo() {
        System.out.println("ElfEquipment " + name + " attack:" + attack + ", defense:" + defense);
    }
}