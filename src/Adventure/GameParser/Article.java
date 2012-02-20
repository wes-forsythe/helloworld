/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

/**
 *
 * @author jeffj
 */
public class Article extends Word {
    public Article(String word) {
        super(word);
    }

    @Override
    public String toString() {
        return "ARTICLE("+super.toString()+")";
    }
}
