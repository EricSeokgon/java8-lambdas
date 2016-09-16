package lambda_expressions.chapter8.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hadeslee on 2016-09-17.
 */
public class Moon {

    private final List<LandingObserver> observers = new ArrayList<>();

    public void land(String name) {
        for (LandingObserver observer : observers) {
            observer.observeLanding(name);
        }
    }
}
