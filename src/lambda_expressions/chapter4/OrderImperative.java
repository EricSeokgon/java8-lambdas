package lambda_expressions.chapter4;

import lambda_expressions.chapter1.Album;
import lambda_expressions.chapter1.Track;

import java.util.List;

/**
 * Project: java8-lambdas
 * FileName: OrderImperative
 * Date: 2016-08-08
 * Time: 오전 8:50
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class OrderImperative extends Order {

    public OrderImperative(List<Album> albums) {
        super(albums);
    }

    public long countRunningTime() {
        long count = 0;
        for (Album album : albums) {
            for (Track track : album.getTrackList()) {
                count += track.getLength();
            }
        }
        return count;
    }

    public long countMusicians() {
        long count = 0;
        for (Album album : albums) {
            count += album.getMusicianList().size();
        }
        return count;
    }

    public long countTracks() {
        long count = 0;
        for (Album album : albums) {
            count += album.getTrackList().size();
        }
        return count;
    }
}
