package builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new HouseBuilder());
        System.out.println(director.buildBuilding());
        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.buildBuilding());
    }
}
