package interpreter;

import java.util.ArrayList;
import java.util.List;

public class ExpressionSequence implements Expression {
    private List<Expression> expressions;

    public ExpressionSequence() {
        this.expressions = new ArrayList<Expression>();
    }

    public void addExpression(Expression expression) {
        expressions.add(expression);
    }

    public void removeExpression(Expression expression) {
        expressions.remove(expression);
    }

    public void interpret() {
        for (Expression expression : expressions) {
            expression.interpret();
        }
    }
}
