package interpreter;

public class MouseClick implements Expression {
    public void interpret() {
        System.out.println("Mouse clicked.");
    }
}
