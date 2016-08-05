package lambda_expressions.chapter4;

import lambda_expressions.chapter1.Album;

import java.util.List;

/**
 * Created by hadeslee on 2016-08-06.
 */
public abstract class Order {
    protected final List<Album> albums;

    public Order(List<Album> albums) {
        this.albums = albums;
    }

    public abstract long countRunningTime();

    public abstract long countMusicians();

    public abstract long countTracks();
}
