package factory.staticFactory;

public class ShapeFactory {
    private interface Shape {
        void draw();
    }

    private class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Circle.draw()");
        }
    }

    private class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Square.draw()");
        }
    }

    public static Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new ShapeFactory().new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new ShapeFactory().new Square();
        }else{
            throw new IllegalArgumentException("Unsupported animal type: " + shapeType);
        }
    }


    public static void main(String[] args) {
        ShapeFactory.getShape("CIRCLE").draw();
        ShapeFactory.getShape("SQUARE").draw();
    }
}
