package lambda_expressions.chapter4;

import lambda_expressions.chapter1.Album;

import java.util.List;

/**
 * Created by hadeslee on 2016-08-09.
 */
public class OrderStreams extends Order {
    public OrderStreams(List<Album> albums) {
        super(albums);
    }

    @Override
    public long countRunningTime() {
        return albums.stream()
                .mapToLong(album -> album.getTracks()
                        .mapToLong(track -> track.getLength())
                        .sum())
                .sum();
    }

    @Override
    public long countMusicians() {
        return albums.stream()
                .mapToLong(album -> album.getMusicians().count())
                .sum();
    }

    @Override
    public long countTracks() {
        return albums.stream()
                .mapToLong(album -> album.getTracks().count())
                .sum();
    }

}
