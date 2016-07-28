package lambda_expressions.chapter4;

/**
 * Project: java8-lambdas
 * FileName: Carriage
 * Date: 2016-07-29
 * Time: 오전 8:51
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Carriage {
    public default String rock() {
        return "... from side to side";
    }
}
