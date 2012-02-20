/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import Adventure.Things.*;
/**
 * For building all the items, fixtures that accessorize the game
 * 
 * @author jeffj
 */
public class Props {
    
    public static Item knife = new Item("knife");
    
    public static void Build() {

        knife.addAliases("blade", "dagger");
    
    }
}
