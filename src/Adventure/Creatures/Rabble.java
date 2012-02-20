/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/**
 *
 * @author jeffj
 */
public class Rabble extends Creature {
    public Rabble(String name) {
        super(name);
        this.movement = new Stationary(this);
    }
    
    @Override
    public String toString() {
        return "RABBLE("+super.toString()+")";
    }
}
