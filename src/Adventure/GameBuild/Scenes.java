/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import java.util.ArrayList;
import Adventure.Locations.*;

/**
 * For building all the locations and the map
 * 
 * @author jeffj
 */
public class Scenes {
        
    public static Location Outside = new Space("Outside");
    public static Location Cave = new Room("Cave");
    
    public static void Build() {
               
        World.addScene(Outside);
        World.addScene(Cave);
        
    }
}