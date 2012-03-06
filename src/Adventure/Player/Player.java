/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Player;

import Adventure.GameParser.Noun;
/**
 *
 * @author jeffj
 */
public final class Player extends Noun {
    
    public static final Player INSTANCE = new Player(); // eager singleton creation
    
    private String name;
    
    private Player() {
        super("an", "adventurer");
        this.setPronoun("him");
        this.setDescription("There is nothing distinct about him, just average looking.");
        reset(); // initialize
    }
    
    public static void reset() {
        
    }

    @Override
    public String toString() {
        return "Player:"+super.toString();
    }
}
