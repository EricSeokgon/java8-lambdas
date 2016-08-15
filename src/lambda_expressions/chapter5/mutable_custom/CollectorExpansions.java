package lambda_expressions.chapter5.mutable_custom;

import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Project: java8-lambdas
 * FileName: CollectorExpansions
 * Date: 2016-08-16
 * Time: 오전 8:38
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CollectorExpansions {
    public static final Collector<AlbumSale, ?, AlbumSalesReport>
    reportingAlbumSales() {
        return Collectors.reducing(new AlbumSalesReport(), album -> new AlbumSalesReport(album), (left, right) -> left.merge(right));
    }
}
