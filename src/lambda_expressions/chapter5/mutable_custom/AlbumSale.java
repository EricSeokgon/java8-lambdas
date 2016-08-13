package lambda_expressions.chapter5.mutable_custom;

import lambda_expressions.chapter1.Album;

/**
 * Created by hadeslee on 2016-08-13.
 */
public final class AlbumSale {
    private final Album album;
    private final Customer customer;
    private final long price;

    public AlbumSale(Album album, Customer customer, long price) {
        this.album = album;
        this.customer = customer;
        this.price = price;
    }

    public Album getAlbum() {
        return album;
    }

    public Customer getCustomer() {
        return customer;
    }

    public long getPrice() {
        return price;
    }
}
