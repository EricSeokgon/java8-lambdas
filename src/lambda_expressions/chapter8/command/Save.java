package lambda_expressions.chapter8.command;

/**
 * Created by hadeslee on 2016-09-14.
 */
public class Save implements Action {

    private final Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}