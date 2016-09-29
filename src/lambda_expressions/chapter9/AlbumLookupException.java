package lambda_expressions.chapter9;

/**
 * Created by hadeslee on 2016-09-30.
 */
public class AlbumLookupException extends RuntimeException {

    public AlbumLookupException(Throwable cause) {
        super(cause);
    }

    public AlbumLookupException(String message) {
        super(message);
    }
}
