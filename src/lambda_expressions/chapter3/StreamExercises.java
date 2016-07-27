package lambda_expressions.chapter3;

import lambda_expressions.chapter1.Artist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by hadeslee on 2016-07-25.
 */
public class StreamExercises {
    public static int countBandMembersExternal(List<Artist> artists) {
        // BEGIN COUNT_MEMBERS_EXTERNAL
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembers();
            totalMembers += members.count();
        }
        // END COUNT_MEMBERS_EXTERNAL

        return totalMembers;
    }

    // map f = foldr ((:) . f) []
    // Advanced Exercise
    public static <T, R> List<R> map(Stream<T> stream, Function<T, R> mapper) {
        return stream.reduce(new ArrayList<>(), (acc, value) -> {
            // Make copy of list (modifying acc would violate contract of reduce method)
            ArrayList<R> result = new ArrayList<>();
            result.addAll(acc);
            result.add(mapper.apply(value));
            return result;
        }, (left, right) -> {
            ArrayList<R> result = new ArrayList<>();
            result.addAll(left);
            result.addAll(right);
            return result;
        });
    }

}
