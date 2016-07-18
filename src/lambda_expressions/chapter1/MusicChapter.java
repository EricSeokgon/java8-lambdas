package lambda_expressions.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: java8-lambdas
 * FileName: MusicChapter
 * Date: 2016-07-19
 * Time: 오전 8:38
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public abstract class MusicChapter {
    protected final List<Artist> artists;
    protected final List<Album> albums;

    public MusicChapter() {
        artists = new ArrayList<>();
        albums = new ArrayList<>();
        loadData("");
    }

    private void loadData(String file) {

    }
}
