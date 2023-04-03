package flyweight;

public class Client {
    public static void main(String[] args) {
        DrawableFactory factory = new DrawableFactory();
        Drawable house = factory.getDrawable("house");
        house.draw(10, 20);
        Drawable river = factory.getDrawable("river");
        river.draw(100, 200);
        Drawable house2 = factory.getDrawable("house");
        house2.draw(30, 40);
    }
}
