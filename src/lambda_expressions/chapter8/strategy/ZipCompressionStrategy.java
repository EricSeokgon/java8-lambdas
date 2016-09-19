package lambda_expressions.chapter8.strategy;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by hadeslee on 2016-09-20.
 */
public class ZipCompressionStrategy implements CompressionStrategy {

    @Override
    public OutputStream compress(OutputStream data) throws IOException {
        return new ZipOutputStream(data);
    }
}
