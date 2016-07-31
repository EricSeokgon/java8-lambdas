package lambda_expressions.chapter4;

/**
 * Created by hadeslee on 2016-07-31.
 */
public interface Child extends Parent {
    @Override
    public default void welcome() {
        message("Child: Hi!");
    }
}
