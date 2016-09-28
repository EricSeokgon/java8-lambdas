package lambda_expressions.chapter9;

import lambda_expressions.chapter1.Album;

/**
 * Created by hadeslee on 2016-09-29.
 */
public interface AlbumLookup {
    Album lookupByName(String albumName);
}
