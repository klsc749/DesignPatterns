package factory.fatoryMethod;

public class SquareFactory extends ShapFactory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
