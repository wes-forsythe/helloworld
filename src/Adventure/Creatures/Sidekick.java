/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/**
 *
 * @author jeffj
 */
public class Sidekick extends Creature {
    public Sidekick(String name) {
        super(name);
        this.movement = new FollowPlayer(this);
    }
    
    @Override
    public String toString() {
        return "SIDEKICK("+super.toString()+")";
    }
}
