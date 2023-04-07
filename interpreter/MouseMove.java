package interpreter;

public class MouseMove implements Expression {
    private int x, y;

    public MouseMove(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void interpret() {
        System.out.println("Mouse moved to (" + x + ", " + y + ").");
    }
}
