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

    public static String formatArtistsForLoop(List<Artist> artists) {
        // BEGIN for_loop
        StringBuilder builder = new StringBuilder("[");
        for (Artist  artist : artists) {
            if (builder.length() > 1)
                builder.append(", ");

            String name = artist.getName();
            builder.append(name);
        }
        builder.append("]");
        String result = builder.toString();
        // END for_loop
        return result;
    }

    public static String formatArtistsRefactor1(List<Artist> artists) {
        // BEGIN refactor_1
        StringBuilder builder = new StringBuilder("[");
        artists.stream()
                .map(Artist::getName)
                .forEach(name -> {
                    if (builder.length() > 1)
                        builder.append(", ");

                    builder.append(name);
                });
        builder.append("]");
        String result = builder.toString();
        // END refactor_1
        return result;
    }
}
