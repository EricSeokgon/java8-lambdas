package lambda_expressions.chapter5.mutable_custom;

/**
 * Created by hadeslee on 2016-08-14.
 */
public class AlbumSalesReport {
    public AlbumSalesReport() {

    }

    public AlbumSalesReport(AlbumSale album) {
        this();
        acknowledgeSale(album);
    }

    public void acknowledgeSale(AlbumSale album) {

    }

    public AlbumSalesReport merge(AlbumSalesReport right) {
        return null;
    }
}
