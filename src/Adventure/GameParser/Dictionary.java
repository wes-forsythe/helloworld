/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.util.*;
/**
 *
 * @author jeffj
 * 
 * @TODO allow multiple definitions for an entry
 */
public enum Dictionary {
    INSTANCE;
    
    private HashMap<String,Definition> entries;
    
    private Dictionary() {
        entries = new HashMap<String,Definition>();
    }
    
    public void addWord(String entry, Word word) {
        Definition def;
        if ((def = entries.get(entry)) == null)
            entries.put(entry, new Definition());
        
    }
    
    public void addCompound(String word, String compound) {
        
    }
    
    public Word lookup(String word) {
        return entries.get(word);
    }
    
    public Word lookup(String word1, String word2) {
        return entries.get(word1+" "+word2);
    }
}