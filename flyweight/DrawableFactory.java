package flyweight;

import java.util.HashMap;

public class DrawableFactory {
    HashMap <String, Drawable> drawables = new HashMap <String, Drawable> ();

    public Drawable getDrawable(String type) {
        Drawable drawable = drawables.get(type);
        if (drawable == null) {
            if (type.equals("house")) {
                drawable = new House();
            } else if (type.equals("river")) {
                drawable = new River();
            } else{
                throw new IllegalArgumentException("Unknown type: " + type);
            }
            drawables.put(type, drawable);
        }
        return drawable;
    }
}
