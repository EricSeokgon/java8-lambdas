package lambda_expressions.chapter8;

import java.io.Reader;
import java.util.List;

/**
 * Created by hadeslee on 2016-09-03.
 */
public class DependencyInversionPrinciple {
    public static interface HeadingFinder {
        public List<String> findHeadings(Reader reader);
    }
}
