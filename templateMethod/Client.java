package templateMethod;

public class Client {
    public static void main(String[] args) {
        PlayerCharater archer = new Archer();
        PlayerCharater warrior = new Warrior();
        archer.attack("Goblin");
        warrior.attack("Goblin");
    }
}
