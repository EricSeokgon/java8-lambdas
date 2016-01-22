package lambda_expressions;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * Project: java8-lambdas
 * FileName: Lambda_expressions
 * Date: 2016-01-22
 * Time: 오전 9:41
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Lambda_expressions {
    public static void main(String[] args) {
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
