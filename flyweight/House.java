package flyweight;

public class House implements Drawable {
    private String image;

    public House() {
        System.out.println("Loading house image");
        image = "House image";
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing house at " + x + ", " + y + " with image " + image);
    }
}
