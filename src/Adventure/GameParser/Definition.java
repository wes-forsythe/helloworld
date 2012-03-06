/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.util.*;
/**
 *
 * @author jeffj
 */
public class Definition {
    private ArrayList<Word> definitions;
    private ArrayList<String> compounds;  // compounds starting with the entry ... be greedy
    private ArrayList<String> classtypes; // class types the word can be used with
    
    public Definition() {
        definitions = new ArrayList<Word>();
        compounds = new ArrayList<String>();
        classtypes = new ArrayList<String>();
    }
    
    public void addWord(Word word) {
        definitions.add(word);
        classtypes.add(word.getClass().getSimpleName());
    }
    
    public void addCompound(String compound) {
        compounds.add(compound);
    }
}
