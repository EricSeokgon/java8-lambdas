package lambda_expressions.chapter4;

/**
 * Created by hadeslee on 2016-07-30.
 */
public interface Parent {
    public void message(String body);

    public default void welcome() {
        message("Parent: Hi!");
    }

    public String getLastMessage();
}
