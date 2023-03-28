package prototype;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = null;
        try {
            clonedShape = (Shape) ShapeCache.getShape("CIRCLE");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        clonedShape.draw();
        try {
            clonedShape = (Shape) ShapeCache.getShape("SQUARE");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        clonedShape.draw();
    }
}
