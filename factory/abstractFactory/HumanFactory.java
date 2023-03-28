package factory.abstractFactory;
import factory.abstractFactory.character.*;
import factory.abstractFactory.character.Character;
import factory.abstractFactory.equipment.*;

public class HumanFactory implements AbstractFactory {
    @Override
    public Character createCharacter() {
        return new HumanCharacter("Human", 1, 100, 100);
    }

    @Override
    public Equipment createEquipment() {
        return new HumanEquipment("Human", 10, 10);
    }
}