package factory.abstractFactory;
import factory.abstractFactory.character.*;
import factory.abstractFactory.character.Character;
import factory.abstractFactory.equipment.*;

public class ElfFactory implements AbstractFactory {

    @Override
    public Character createCharacter() {
        return new ElfCharacter("Elf", 1, 100, 100);
    }

    @Override
    public Equipment createEquipment() {
        return new ElfEquipment("Elf", 10, 10);
    }
}