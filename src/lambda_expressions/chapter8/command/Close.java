package lambda_expressions.chapter8.command;

/**
 * Created by hadeslee on 2016-09-10.
 */
public class Close implements Action {

    private final Editor editor;

    public Close(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
