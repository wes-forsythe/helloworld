/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameEngine;

import java.io.*;
import java.util.ArrayList;
import Adventure.Creatures.ClockWatcher;

import Adventure.GameParser.*;
import Adventure.GameBuild.*;

/**
 *
 * @author jeffj
 */
public enum Engine implements Clock {
    INSTANCE;
    
    private InputStream in = System.in;
    private PrintStream out = System.out;
    private ArrayList<ClockWatcher> watchers = new ArrayList<ClockWatcher>();

    Parser parser = new Parser();
    private World world;
    
    private int elapsed = 0;
    @Override
    public void tick() {
        ++elapsed;
        for(ClockWatcher w : watchers)
            w.tock();
    }
    @Override
    public void subscribe(ClockWatcher w) {
        watchers.add(w);
    }
    @Override
    public void unsubscribe(ClockWatcher w) {
        int i = watchers.indexOf(w);
        if (i >= 0)
            watchers.remove(i);
    }
    
    public void setInput(InputStream in) {
        this.in = in;
    }
    
    public void setOutput(PrintStream out) {
        this.out = out;
    }
    
    public void Play() throws IOException {
        Action action;
        
        parser.setInput(in);
        parser.setOutput(out);
        
        World.Build();
        out.printf("Welcome to %s, %s!\n\n", world.name, world.adventurer.Name());
        out.printf("Type \"help\" to get instructions.\n");
        do {
            action = parser.parse();    // get and parse user input
                                        // distrubute action and execute
            tick();                     // increment clock... tell other parts to update  
                                        // generate view
        } while (!action.Action().equals("quit"));
    }
}