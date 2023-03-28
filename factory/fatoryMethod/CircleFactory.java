package factory.fatoryMethod;

public class CircleFactory extends ShapFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
