/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import Adventure.GameParser.*;

/**
 * For building vocabulary and rules used in the parser
 * 
 * @author jeffj
 */
public class Dialog {
    
    public static Verb quit = new Verb("quit");
    public static Verb take = new Verb("take");
    
    public static void Build() {

        quit.addAliases("exit");
        take.addAliases("get", "pick up", "pickup", "steal");
    
    }
}
