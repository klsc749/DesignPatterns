package flyweight;

public class River implements Drawable {
    private String image;

    public River() {
        System.out.println("Loading river image");
        image = "River image";
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing river at " + x + ", " + y + " with image " + image);
    }
}
