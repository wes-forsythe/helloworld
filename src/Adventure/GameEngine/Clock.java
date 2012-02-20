/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameEngine;

import Adventure.Creatures.ClockWatcher;
/**
 * Observer Design Patter
 * 
 * @author jeffj
 */
public interface Clock {                    // Subject interface
    
    public void tick();                     // notifyObservers()
    public void subscribe(ClockWatcher w);  // registerObserver() 
    public void unsubscribe(ClockWatcher w);// removeObserver()
}