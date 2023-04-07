package interpreter;

public class Repetition implements Expression {
    private int count;
    private Expression expression;

    public Repetition(int count, Expression expression) {
        this.count = count;
        this.expression = expression;
    }

    public void interpret() {
        System.out.println("Repeating " + count + " times.");
        for (int i = 0; i < count; i++) {
            System.out.print("Repetition " + (i + 1) + ": ");
            expression.interpret();
        }
        System.out.println("Repetition finished.");
    }
}