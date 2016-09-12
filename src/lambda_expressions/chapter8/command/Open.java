package lambda_expressions.chapter8.command;

/**
 * Created by hadeslee on 2016-09-13.
 */
public class Open implements Action {

    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
