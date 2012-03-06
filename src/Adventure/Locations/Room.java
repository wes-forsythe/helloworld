/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Locations;

/**
 *
 * @author jeffj
 */
public class Room extends Location {
    
    public Room(String name) {
        super(name);
    }
    
    @Override
    public String toString() {
        return "ROOM("+super.toString()+")";
    }
}
