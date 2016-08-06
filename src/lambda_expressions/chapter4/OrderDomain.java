package lambda_expressions.chapter4;

import lambda_expressions.chapter1.Album;

import java.util.List;
import java.util.function.ToLongFunction;

/**
 * Created by hadeslee on 2016-08-06.
 */
public class OrderDomain extends Order {

    public OrderDomain(List<Album> albums) {
        super(albums);
    }

    public long countFeature(ToLongFunction<Album> function) {
        return albums.stream()
                .mapToLong(function)
                .sum();
    }

    @Override
    public long countRunningTime() {
        return countFeature(albums -> albums.getTracks()
                .mapToLong(track -> track.getLength())
                .sum());
    }

    @Override
    public long countMusicians() {
        return countFeature(album -> album.getMusicians().count());
    }

    @Override
    public long countTracks() {
        return countFeature((albums -> albums.getTracks().count()));
    }


}
