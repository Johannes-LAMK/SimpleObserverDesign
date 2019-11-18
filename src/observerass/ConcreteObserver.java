/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerass;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johannes
 */
public class ConcreteObserver implements IObserver {
    private String _name;
    
    public ConcreteObserver(Subject sub, String name) {
        this._name = name;
        sub.reg(this);
    }

    @Override
    public void update() {
        System.out.println(this._name + " observer noticed that a second has passed");
    }
}
