package lambda_expressions.chapter4;

/**
 * Created by hadeslee on 2016-08-10.
 */
public class OverridingParent extends ParentImpl {

    @Override
    public void welcome() {
        message("Class Parent: Hi");
    }
}
