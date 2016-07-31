package lambda_expressions;

import org.junit.Test;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * Created by hadeslee on 2016-07-31.
 */
public class Lambda_expressionsTest {
    @Test
    public void main() throws Exception {
        Lambda_expressions lambdaExpressions = new Lambda_expressions();
        Runnable noArguments = () -> System.out.println("Hello World!");
        ActionListener oneArgument = event -> System.out.println("button clicked");

        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println("World");
        };
        BinaryOperator<Long> add = (x, y) -> x + y;

        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x, longBinaryOperator;
    }

}