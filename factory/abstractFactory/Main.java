package factory.abstractFactory;
import factory.abstractFactory.equipment.Equipment;
import factory.abstractFactory.character.Character;

public class Main {
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        Character humanCharacter = humanFactory.createCharacter();
        Equipment humanEquipment = humanFactory.createEquipment();
        humanCharacter.attack();
        humanEquipment.showInfo();
        ElfFactory elfFactory = new ElfFactory();
        Character elfCharacter = elfFactory.createCharacter();
        Equipment elfEquipment = elfFactory.createEquipment();
        elfCharacter.attack();
        elfEquipment.showInfo();
    }
}
