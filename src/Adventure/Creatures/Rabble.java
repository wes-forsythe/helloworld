/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Creatures;

/**
 * The Rabble class contains a type of Creature called Rabble, which is a 
 * subclass of class Creature.
 * @author Sulav Regmi
 * @version 20120209-01
 */
public class Rabble extends Creature {
    /**
     * Calls the superclass with the "super" keyword which passes the parameter of type 
     * String.It also assigns the movement for this type of Creature as Stationary, by
     * calling the class Stationary and passing the current caller.
     * @param name Takes a String type. 
     */
    public Rabble(String name) {
        super(name);
        this.movement = new Stationary(this);
    }
    /**
     * @Override overrides the method declared in superclass
     * @return "RABBLE(" with Superclass's toString() method.
     */
    @Override
    public String toString() {
        return "RABBLE("+super.toString()+")";
    }
}
