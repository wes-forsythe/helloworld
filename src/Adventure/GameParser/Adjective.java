/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

/**
 *
 * @author jeffj
 */
public class Adjective extends Word {
    public Adjective(String word) {
        super(word);
    }

    @Override
    public String toString() {
        return "ADJECTIVE("+super.toString()+")";
    }    
}
