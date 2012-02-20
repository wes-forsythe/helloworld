/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/**
 *
 * @author jeffj
 */
public class Monster extends Creature {
    public Monster(String name) {
        super(name);
        this.movement = new Aggressive(this);
    }
    
    @Override
    public String toString() {
        return "MONSTER("+super.toString()+")";
    }
}
