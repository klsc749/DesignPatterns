package prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
    public static void loadCache(){
        Circle circle = new Circle();
        shapeMap.put("CIRCLE", circle);
        Square square = new Square();
        shapeMap.put("SQUARE", square);
    }

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
}
