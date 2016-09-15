package lambda_expressions.chapter8.observer;

/**
 * Created by hadeslee on 2016-09-16.
 */
public class Aliens implements LandingObserver {

    @Override
    public void observeLanding(String name) {
        if (name.contains("Apollo")) {
            System.out.println("They're distracted, lets invade earth!");
        }
    }

}