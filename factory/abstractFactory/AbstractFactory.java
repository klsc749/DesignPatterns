package factory.abstractFactory;

import factory.abstractFactory.character.Character;
import factory.abstractFactory.equipment.Equipment;

public interface AbstractFactory {
    public Character createCharacter();
    public Equipment createEquipment();
}
