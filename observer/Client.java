package observer;

public class Client {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("Sword");
        Character character1 = new Character("Character 1");
        Character character2 = new Character("Character 2");
        weapon.addObserver(character1);
        weapon.addObserver(character2);

        weapon.attack();
    }
}
