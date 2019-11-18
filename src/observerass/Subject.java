/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johannes
 */
public class Subject {

    // list for all observer for this subject
    private List<IObserver> observers = new ArrayList<IObserver>();

    // the register function which adds and observer to the list of the subject,
    // and sleeps for one second(event).
    public void reg(IObserver observer) {
        observers.add(observer);
    }

    // the unregister function
    public void unreg(IObserver observer) {
        observers.remove(observer);
    }

    // the notify call update for all observers on the subject (list)
    public void notifyFunc() {
        this.observers.forEach((t) -> {
            t.update();
        });
    }
    public void event(){
        try {
            TimeUnit.SECONDS.sleep(1);
            this.notifyFunc();
        } catch (InterruptedException ex) {
            Logger.getLogger(Subject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
