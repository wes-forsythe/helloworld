/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/**
 * The Stationary class is a subclass of class MoveAction and defines the
 * type of movement.
 * @author Sulav Regmi
 * @version 20120210-01
 */
public class Stationary extends MoveAction {
    /**
     * Calls it's superclass, MoveAction, passing the type "Object" parameter to it. 
     * @param caller Takes the type Object which is in the "java.lang" package.
     * @see java.lang.Object
     */
    public Stationary(Object caller) {
        super(caller);
    }
    /**
     * @Override overrides the method declared in superclass.
     * @return "MOVE(Stationary)"
     */
    @Override
    public String toString() {
        return "MOVE(Stationary)";
    }
}
