package lambda_expressions.chapter1;

import lambda_expressions.chapter1.Artist;
import lambda_expressions.chapter1.MusicChapter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: java8-lambdas
 * FileName: Chapter1
 * Date: 2016-07-19
 * Time: 오전 8:42
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Chapter1 extends MusicChapter {
    public List<String> getNamesOfArtists_Lambda() {
        return artists.stream()
                .map(artist -> artist.getName())
                .collect(Collectors.toList());
    }

    public List<String> getNamesOfArtists_MethodReference() {
        return artists.stream()
                .map(Artist::getName)
                .collect(Collectors.toList());
    }

    public List<Artist> artistsLivingInLondon() {
        return artists.stream()
                .filter(artist -> "London".equals(artist.getNationality()))
                .collect(Collectors.toList());
    }

}
