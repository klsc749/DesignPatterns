package factory.abstractFactory.equipment;

public class HumanEquipment extends Equipment {
    public HumanEquipment(String name, int attack, int defense) {
        super(name, attack, defense);
    }

    @Override
    public void showInfo() {
        System.out.println("HumanEquipment " + name + " attack:" + attack + ", defense:" + defense);
    }
}
