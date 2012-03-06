/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

import Adventure.GameParser.Noun;
import Adventure.Locations.*;
/**
 *
 * @author jeffj
 * 
 * @TODO move Noun from parent to composite part, implement Label interface
 */
public abstract class Creature extends Noun implements ClockWatcher {

    private String name;
    
    protected MoveAction movement;
    protected Location location;
    
    public Creature(String name) {
        super(name.toLowerCase());
        this.name = name;
    }
    
    @Override
    public void tock() {
        this.movement.move();
    }
    
    public void setMovement(MoveAction movement) {
        this.movement = movement;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    
    @Override
    public String toString() {
        return this.name+","+this.movement+","+this.location;
    }
}
