package lambda_expressions.chapter8.observer;

/**
 * Created by hadeslee on 2016-09-18.
 */
public class Nasa implements LandingObserver {
    @Override
    public void observeLanding(String name) {
        if (name.contains("Apollo")) {
            System.out.println("We made it!");
        }
    }
}