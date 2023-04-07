package interpreter;

public class Client {
    public static void main(String[] args) {
        Expression mouseMove = new MouseMove(1, 2);
        Expression mouseClick = new MouseClick();
        Expression repetition = new Repetition(5, mouseClick);

        ExpressionSequence sequence = new ExpressionSequence();
        sequence.addExpression(mouseMove);
        sequence.addExpression(repetition);
        sequence.interpret();
    }
}
