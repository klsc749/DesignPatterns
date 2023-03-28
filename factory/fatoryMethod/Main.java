package factory.fatoryMethod;

public class Main {
    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.getShape();
        circle.draw();

        SquareFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.getShape();
        square.draw();
    }
}
