/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/**
 *
 * @author jeffj
 */
public abstract class MoveAction {
    private Object caller;
    
    public MoveAction(Object caller) {
        this.caller = caller;
    }
    
    public void move() {
        System.out.printf("%s\n", caller.toString());
    }    
}