package lambda_expressions.chapter3;

import lambda_expressions.chapter1.Artist;

import java.util.List;
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

}
