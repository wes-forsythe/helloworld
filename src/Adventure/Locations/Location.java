/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.Locations;

import Adventure.GameParser.Noun;
/**
 *
 * @author jeffj
 */
public abstract class Location extends Noun {
    
    protected String name;
    
    public Location(String name) {
        super(name.toLowerCase());
        this.name = name;
    }   
    
    @Override
    public String toString() {
        return this.name;
    }
}