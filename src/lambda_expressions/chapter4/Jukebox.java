package lambda_expressions.chapter4;

/**
 * Project: java8-lambdas
 * FileName: Jukebox
 * Date: 2016-08-04
 * Time: 오전 8:45
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Jukebox {
    public default String rock(){
        return "... all over the world!";
    }
}
