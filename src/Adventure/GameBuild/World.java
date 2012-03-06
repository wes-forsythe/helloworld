/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameBuild;

import Adventure.GameEngine.Master;
import java.util.ArrayList;
import Adventure.Player.*;
import Adventure.Creatures.*;
import Adventure.Locations.*;
import Adventure.GameParser.*;

/**
 * Builds the entire world of the game
 * 
 * @author jeffj
 */
public class World {
    
    public static final String name      = "ADVENTURE";
    public static final String title     = name+": Coping with Classes and Patterns";
    public static final String copyright = "Copyright (c) 2012. All rights reserved.";
    public static final String version   = "0.1α";
    public static final String release   = "20120201";
    public static final String IFID      = "49644288-6D81-41C8-A4B6-1EEAECC74C51";
    
    public static final Master master = Master.INSTANCE;
    public static final Player adventurer = Player.INSTANCE;
    public static final Dictionary dictionary = Dictionary.INSTANCE;
    public static final ArrayList<Creature> actors = new ArrayList<Creature>();
    public static final ArrayList<Location> scenes = new ArrayList<Location>();
    
    public static void Build() {
        Dialog.Build();
        Props.Build();
        Actors.Build();
        Scenes.Build();
    }
    
    public static void addActor(Creature c) {
        actors.add(c);
    }
    
    public static void addScene(Location l) {
        scenes.add(l);
    }
}