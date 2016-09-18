package lambda_expressions.chapter8.strategy;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by hadeslee on 2016-09-19.
 */
public interface CompressionStrategy {
    public OutputStream compress(OutputStream data) throws IOException;

}
