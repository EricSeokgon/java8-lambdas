package lambda_expressions.chapter4;

import lambda_expressions.chapter1.Album;

import java.util.IntSummaryStatistics;

/**
 * Created by hadeslee on 2016-08-12.
 */
public class Primitives {
    // BEGIN printTrackLengthStatistics
    public static void printTrackLengthStatistics(Album album) {
        IntSummaryStatistics trackLengthStats
                = album.getTracks()
                .mapToInt(track -> track.getLength())
                .summaryStatistics();

        System.out.printf("Max: %d, Min: %d, Ave: %f, Sum: %d",
                trackLengthStats.getMax(),
                trackLengthStats.getMin(),
                trackLengthStats.getAverage(),
                trackLengthStats.getSum());
    }
// END printTrackLengthStatistics
}
