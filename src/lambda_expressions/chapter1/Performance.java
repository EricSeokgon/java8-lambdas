package lambda_expressions.chapter1;

import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

/**
 * Project: java8-lambdas
 * FileName: Performance
 * Date: 2016-07-19
 * Time: 오전 8:40
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Performance {
    public String getName();

    public Stream<Artist> getMusicians();

    // TODO: test
    public default Stream<Artist> getAllMusicians() {
        return getMusicians().flatMap(artist -> {
            return concat(Stream.of(artist), artist.getMembers());
        });
    }
}
