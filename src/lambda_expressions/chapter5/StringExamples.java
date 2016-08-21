package lambda_expressions.chapter5;

import lambda_expressions.chapter1.Artist;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hadeslee on 2016-08-22.
 */
public class StringExamples {

    public static String formatArtists(List<Artist> artists) {
        // BEGIN collectors_joining
        String result =
                artists.stream()
                        .map(Artist::getName)
                        .collect(Collectors.joining(", ", "[", "]"));
        // END collectors_joining
        return result;
    }
}
