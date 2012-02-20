/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Locations;

/**
 *
 * @author jeffj
 */
public class Space extends Location {
    
    public Space(String name) {
        super(name);
    }
        
    @Override
    public String toString() {
        return "SPACE("+super.toString()+")";
    }
}