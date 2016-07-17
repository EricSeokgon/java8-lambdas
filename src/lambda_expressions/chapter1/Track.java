package lambda_expressions.chapter1;

/**
 * Project: java8-lambdas
 * FileName: Track
 * Date: 2016-07-18
 * Time: 오전 8:56
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Track {
    private final String name;
    private final int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the length of the track in milliseconds.
     */
    public int getLength() {
        return length;
    }

    public Track copy() {
        return new Track(name, length);
    }

}
