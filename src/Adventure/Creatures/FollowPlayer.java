/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/**
 *
 * @author jeffj
 */
public class FollowPlayer extends MoveAction {
    public FollowPlayer(Object caller) {
        super(caller);
    }
    
    @Override
    public String toString() {
        return "MOVE(Follow)";
    }
}