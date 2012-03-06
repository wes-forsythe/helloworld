/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import java.util.ArrayList;
import Adventure.Creatures.*;
import static Adventure.GameBuild.Scenes.*;
import Adventure.GameEngine.*;

/**
 * For building NPC's used in game interaction
 * 
 * @author jeffj
 */
public class Actors {
        
    public static Monster Boris = new Monster("Boris");
    public static Rabble Frank = new Rabble("Frank");
    public static Sidekick Robin = new Sidekick("Robin");
    
    public static void Build() {
        
        Boris.setLocation(Cave);
        World.addActor(Boris);
        
        Frank.setLocation(Cave);
        Frank.setMovement(new Random(Frank));
        World.addActor(Frank);
        
        Robin.setLocation(Outside);
        World.addActor(Robin);
        
        
        Engine e = Engine.INSTANCE;
        for (ClockWatcher w : World.actors)
            e.subscribe(w);
    
    }
}
