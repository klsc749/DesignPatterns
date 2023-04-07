package visitor;

public class Client {
    public static void main(String[] args) {
        Character human = new Human(100, 10);
        Character witcher = new Witcher(100, 10);
        
        DamageCalculator visitor = new DamageCalculator();

        visitor.setAttacker(witcher);
        
        System.out.println(human);
        human.accept(visitor);
        System.out.println(human);
    }
}
