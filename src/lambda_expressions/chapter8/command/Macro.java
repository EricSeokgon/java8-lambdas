package lambda_expressions.chapter8.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hadeslee on 2016-09-12.
 */
public class Macro {
    private final List<Action> actions;

    public Macro() {
        actions = new ArrayList<>();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }

}
