/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

import java.util.ArrayList;
/**
 *
 * @author jeffj
 * 
 * @todo Check logic to make sure words are all lowercase, make efficient
 */
public abstract class Word {
    private String archetype;
    private ArrayList<String> aliases;
    
    public Word(String word) {
        this.archetype = word.toLowerCase();
        this.aliases = new ArrayList<String>();
        this.aliases.add(word);
    }
    
    public String get() {
        return this.archetype;
    }
    
    public boolean matches(String word) {
        boolean result = this.archetype.equals(word);
        
        for(int i=0; !result && i<this.aliases.size(); ++i)
            if (aliases.get(i).equals(word))
                result = true;
            
        return result;
    }
    
    public ArrayList<String> aliases() {
        return this.aliases;
    }
    
    public void addAliases(String ... aliases) {
        Dictionary dict = Dictionary.INSTANCE;
        dict.addWord(this.archetype,this); // FIX THIS
        for (String alias: aliases) {
            alias = alias.toLowerCase();
            this.aliases.add(alias);
            dict.addWord(alias, this);
        }
    }
    
    @Override
    public String toString() {
        return archetype;
    }
}